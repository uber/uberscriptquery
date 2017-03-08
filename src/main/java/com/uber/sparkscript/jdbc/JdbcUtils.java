/*
 * Copyright (c) 2017 Uber Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.uber.sparkscript.jdbc;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.spark.sql.types.DataTypes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JdbcUtils {
  private static final Logger LOG = Logger.getLogger(JdbcUtils.class);

  public static String getCreateTableSql(List<String> columnNames, List<org.apache.spark.sql.types.DataType> columnTypes, String tableName, List<String> primaryKeys, List<String> indexColumns, List<String> textColumns) {
    if (columnNames.size() != columnTypes.size()) {
      throw new RuntimeException(String.format("Number of column names (%s) is different from number of column types (%s)", columnNames.size(), columnTypes.size()));
    }

    if (indexColumns == null) {
      indexColumns = new ArrayList<>();
    }

    if (textColumns == null) {
      textColumns = new ArrayList<>();
    }

    LOG.info(String.format("Getting sql to create table, column name: %s, column types: %s, table name: %s, primary keys: %s, index columns: %s, text columns: %s",
            StringUtils.join(columnNames, ','),
            StringUtils.join(columnTypes, ','),
            tableName,
            StringUtils.join(primaryKeys, ','),
            StringUtils.join(indexColumns, ','),
            StringUtils.join(textColumns, ',')));

    Set<String> primaryKeysLowerCase = new HashSet<>();
    for (String entry : primaryKeys) {
      primaryKeysLowerCase.add(entry.toLowerCase());
    }

    Set<String> indexColumnsLowerCase = new HashSet<>();
    for (String entry : indexColumns) {
      indexColumnsLowerCase.add(entry.toLowerCase());
    }

    Set<String> textColumnsLowerCase = new HashSet<>();
    for (String entry : textColumns) {
      textColumnsLowerCase.add(entry.toLowerCase());
    }

    StringBuilder sb = new StringBuilder();
    sb.append(String.format("CREATE TABLE IF NOT EXISTS %s (", tableName));

    List<org.apache.spark.sql.types.DataType> primaryKeyTypes = new ArrayList<>();
    List<String> matchedPrimaryKeys = new ArrayList<>();

    List<org.apache.spark.sql.types.DataType> indexColumnTypes = new ArrayList<>();
    List<String> matchedIndexColumns = new ArrayList<>();

    List<String> otherColumnNames = new ArrayList<>();
    List<org.apache.spark.sql.types.DataType> otherColumnTypes = new ArrayList<>();

    for (int i = 0; i < columnNames.size(); i++) {
      String columnName = columnNames.get(i);
      org.apache.spark.sql.types.DataType columnType = columnTypes.get(i);
      if (primaryKeysLowerCase.contains(columnName.toLowerCase())) {
        primaryKeyTypes.add(columnType);
        matchedPrimaryKeys.add(columnName);
      }
      if (indexColumnsLowerCase.contains(columnName.toLowerCase())) {
        indexColumnTypes.add(columnType);
        matchedIndexColumns.add(columnName);
      }
      if (!primaryKeysLowerCase.contains(columnName.toLowerCase())
              && !indexColumnsLowerCase.contains(columnName.toLowerCase())) {
        otherColumnNames.add(columnName);
        otherColumnTypes.add(columnType);
      }
    }

    if (primaryKeyTypes.size() != primaryKeys.size()) {
      throw new RuntimeException(String.format("Invalid primary keys. There are %s in matched primary keys (%s), but %s in given primary keys (%s)",
              primaryKeyTypes.size(),
              StringUtils.join(matchedPrimaryKeys, ','),
              primaryKeys.size(),
              StringUtils.join(primaryKeys, ',')));
    }

    if (indexColumnTypes.size() != indexColumns.size()) {
      throw new RuntimeException(String.format("Invalid index fields. There are %s matched index columns (%s), but %s in given index columns (%s)",
              indexColumnTypes.size(),
              StringUtils.join(matchedIndexColumns, ','),
              indexColumns.size(),
              StringUtils.join(indexColumns, ',')));
    }

    // Order columns in sequence: Primary Keys, Index Columns (exclude primary keys), Other Columns
    List<String> reorderedColumnNames = new ArrayList<>();
    List<org.apache.spark.sql.types.DataType> reorderedColumnTypes = new ArrayList<>();



    reorderedColumnNames.addAll(matchedPrimaryKeys);
    reorderedColumnTypes.addAll(primaryKeyTypes);

    for (int i = 0; i < matchedIndexColumns.size(); i++) {
      String columnName = matchedIndexColumns.get(i);
      if (primaryKeysLowerCase.contains(columnName.toLowerCase())) {
        continue;
      }
      reorderedColumnNames.add(columnName);
      reorderedColumnTypes.add(indexColumnTypes.get(i));
    }

    reorderedColumnNames.addAll(otherColumnNames);
    reorderedColumnTypes.addAll(otherColumnTypes);

    if (reorderedColumnNames.size() != columnNames.size()) {
      throw new RuntimeException(String.format("Invalid columns after re-ordering: %s (%s) v.s. %s (%s)",
              reorderedColumnNames.size(),
              StringUtils.join(reorderedColumnNames, ','),
              columnNames.size(),
              StringUtils.join(columnNames, ',')));
    }



    sb.append(reorderedColumnNames.get(0));
    sb.append(" ");
    sb.append(getJdbcTypeString(
            reorderedColumnTypes.get(0),
            primaryKeysLowerCase.contains(reorderedColumnNames.get(0).toLowerCase()) || indexColumnsLowerCase.contains(reorderedColumnNames.get(0).toLowerCase()),
            textColumnsLowerCase.contains(reorderedColumnNames.get(0).toLowerCase())));

    for (int i = 1; i < reorderedColumnNames.size(); i++) {
      sb.append(", ");
      sb.append(reorderedColumnNames.get(i));
      sb.append(" ");
      sb.append(getJdbcTypeString(
              reorderedColumnTypes.get(i),
              primaryKeysLowerCase.contains(reorderedColumnNames.get(i).toLowerCase()) || indexColumnsLowerCase.contains(reorderedColumnNames.get(i).toLowerCase()),
              textColumnsLowerCase.contains(reorderedColumnNames.get(i).toLowerCase())));
    }

    if (!primaryKeyTypes.isEmpty()) {
      sb.append(", PRIMARY KEY(");
      sb.append(primaryKeys.get(0));
      for (int i = 1; i < primaryKeyTypes.size(); i++) {
        sb.append(", ");
        sb.append(primaryKeys.get(i));
      }
      sb.append(")");
    }

    for (int i = 0; i < indexColumnTypes.size(); i++) {
      sb.append(String.format(", INDEX index_%s (%s)",
              indexColumns.get(i),
              indexColumns.get(i)));
    }

    sb.append(")");
    return sb.toString();
  }

  public static String getJdbcTypeString(Class<?> valueClass, boolean isPrimaryKeyOrUniqueKey, boolean isDatetime, boolean isText) {
    int maxVarcharLength = isPrimaryKeyOrUniqueKey ? 150 : 250;
    String sqlTypeForString = isText ? "TEXT" : String.format("VARCHAR(%s)", maxVarcharLength);
    if (isDatetime || valueClass.equals(Date.class)) {
      return "DATETIME";
    } else if (valueClass.equals(String.class)) {
      return sqlTypeForString;
    } else if (valueClass.equals(Integer.class)) {
      return "INT";
    } else if (valueClass.equals(Long.class)) {
      return "BIGINT";
    } else if (valueClass.equals(Float.class)) {
      return "FLOAT";
    } else if (valueClass.equals(Double.class)) {
      return "DOUBLE";
    } else if (valueClass.equals(Boolean.class)) {
      return "TINYINT";
    } else {
      throw new RuntimeException(String.format("Unsupported property type for JDBC: %s", valueClass));
    }
  }

  public static String getJdbcTypeString(org.apache.spark.sql.types.DataType dataType, boolean isPrimaryKeyOrIndexKey, boolean isText) {
    int maxVarcharLength = isPrimaryKeyOrIndexKey ? 150 : 250;
    String sqlTypeForString = isText ? "TEXT" : String.format("VARCHAR(%s)", maxVarcharLength);
    if (dataType == DataTypes.TimestampType || dataType == DataTypes.DateType) {
      return "DATETIME";
    } else if (dataType == DataTypes.StringType) {
      return sqlTypeForString;
    } else if (dataType == DataTypes.IntegerType) {
      return "INT";
    } else if (dataType == DataTypes.LongType) {
      return "BIGINT";
    } else if (dataType == DataTypes.FloatType) {
      return "FLOAT";
    } else if (dataType == DataTypes.DoubleType) {
      return "DOUBLE";
    } else if (dataType == DataTypes.BooleanType) {
      return "TINYINT";
    } else if (dataType == DataTypes.ByteType) {
      return "SMALLINT";
    } else if (dataType instanceof org.apache.spark.sql.types.DecimalType) {
      org.apache.spark.sql.types.DecimalType decimalType = (org.apache.spark.sql.types.DecimalType)dataType;
      return String.format("DECIMAL(%d,%d)", decimalType.precision(), decimalType.scale());
    } else {
      throw new RuntimeException(String.format("Unsupported property type for JDBC: %s", dataType));
    }
  }

  public static List<List<Object>> executeQuery(String jdbcConnectionString, String sql) {
    LOG.info("Running sql: " + sql);
    try (Connection connection = getConnection(jdbcConnectionString)) {
      try (PreparedStatement stmt = connection.prepareStatement(sql)){
        ResultSet resultSet = stmt.executeQuery();
        List<List<Object>> result = new ArrayList<List<Object>>();
        while (resultSet.next()) {
          List<Object> row = new ArrayList<>();
          for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
            row.add(resultSet.getObject(i + 1));
          }
          result.add(row);
        }
        LOG.info("Finished sql: " + sql);
        return result;
      }
    } catch(SQLException e){
      throw new RuntimeException("Failed to execute sql: " + sql, e);
    }
  }

  public static Connection getConnection(String jdbcConnectionString) {
    try {
      return DriverManager.getConnection(jdbcConnectionString);
    } catch (SQLException e) {
      throw new RuntimeException("Failed to create jdbc connection: " + jdbcConnectionString, e);
    }
  }
}
