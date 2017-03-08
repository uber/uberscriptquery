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

import com.uber.sparkscript.util.DateTimeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SingleTableJdbcWriter implements AutoCloseable {
  private static final Logger LOG = Logger.getLogger(SingleTableJdbcWriter.class);

  private static ObjectMapper mapper = new ObjectMapper();

  static {
    mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
    mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
    mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
  }

  private JdbcConnectionProvider connectionProvider;
  private String tableName;

  private Set<String> ignoreColumnsLowerCase = new HashSet<>();
  private Set<String> textColumnsLowerCase = new HashSet<>();

  private List<String> primaryKeys = new ArrayList<>();

  private List<String> columnNames = new ArrayList<>();
  private List<String> columnNamesLowerCase = new ArrayList<>();

  private Map<String, String> columnTypes = new HashMap<>();

  public SingleTableJdbcWriter(String jdbcConnectionString, String tableName, Collection<String> ignoreColumns, Collection<String> textColumns) {
    this(new JdbcConnectionProvider(jdbcConnectionString), tableName, ignoreColumns, textColumns);
  }

  public SingleTableJdbcWriter(JdbcConnectionProvider jdbcConnectionProvider, String tableName, Collection<String> ignoreColumns, Collection<String> textColumns) {
    this.connectionProvider = jdbcConnectionProvider;
    this.tableName = tableName;

    if (ignoreColumns != null) {
      for (String entry : ignoreColumns) {
        this.ignoreColumnsLowerCase.add(entry.toLowerCase());
        LOG.info("Will ignore column: " + entry);
      }
    }

    if (textColumns != null) {
      for (String entry : textColumns) {
        this.textColumnsLowerCase.add(entry.toLowerCase());
        LOG.info("Has text column: " + entry);
      }
    }
  }

  public void initialize() {
    this.getTableMetadata();
  }

  public void writeColumns(List<String> columnNames, List<Object> columnValues) {
    if (columnNames.size() != columnValues.size()) {
      throw new RuntimeException(String.format("", columnNames.size(), columnValues.size()));
    }

    if (this.columnNames.isEmpty()) {
      this.initialize();
    }

    List<String> effectiveColumnNames = new ArrayList<>();
    List<Object> effectiveColumnValues = new ArrayList<>();

    for (int i = 0; i < columnNames.size(); i++) {
      String columnName = columnNames.get(i);
      Object columnValue = columnValues.get(i);

      if (ignoreColumnsLowerCase.contains(columnName.toLowerCase())) {
        continue;
      }

      effectiveColumnNames.add(columnName);
      effectiveColumnValues.add(columnValue);
    }

    List<String> updateList = new ArrayList<>();
    for (int i = 0; i < effectiveColumnNames.size(); i++) {
      updateList.add(String.format("%s=?", effectiveColumnNames.get(i)));
    }

    String sql = String.format("INSERT INTO %s (%s) VALUES (%s) ON DUPLICATE KEY UPDATE %s",
            tableName,
            StringUtils.join(effectiveColumnNames, ", "),
            StringUtils.join(Collections.nCopies(effectiveColumnNames.size(), "?"), ", "),
            StringUtils.join(updateList, ", "));
    LOG.info("Running sql: " + sql);
    Connection connection = connectionProvider.getConnection();
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
      for (int i = 0; i < effectiveColumnValues.size(); i++) {
        if (effectiveColumnValues.get(i) == null) {
          stmt.setObject(i + 1, null);
        } else if (textColumnsLowerCase.contains(effectiveColumnNames.get(i).toLowerCase())) {
          Clob clob = connection.createClob();
          clob.setString(1, effectiveColumnValues.get(i).toString());
          stmt.setClob(i + 1, clob);
        } else {
          stmt.setObject(i + 1, effectiveColumnValues.get(i));
        }
      }
      for (int i = 0; i < effectiveColumnValues.size(); i++) {
        if (effectiveColumnValues.get(i) == null) {
          stmt.setObject(effectiveColumnValues.size() + i + 1, null);
        } else if (textColumnsLowerCase.contains(effectiveColumnNames.get(i).toLowerCase())) {
          Clob clob = connection.createClob();
          clob.setString(1, effectiveColumnValues.get(i).toString());
          stmt.setClob(effectiveColumnValues.size() + i + 1, clob);
        } else {
          stmt.setObject(effectiveColumnValues.size() + i + 1, effectiveColumnValues.get(i));
        }
      }
      stmt.executeUpdate();
      LOG.info("Finished sql: " + sql);
    } catch (Throwable e) {
      connectionProvider.close();
      String dataStr = String.format("Columns: %s, Values: %s", StringUtils.join(columnNames, ','), StringUtils.join(columnValues, ','));
      throw new RuntimeException(
              String.format("Failed to run sql [%s] to insert data: %s: %s", sql, dataStr, ExceptionUtils.getStackTrace(e)),
              e);
    }
  }

  @Override
  public void close() throws Exception {
    if (connectionProvider == null) {
      return;
    }

    connectionProvider.close();
    connectionProvider = null;
  }

  private void getTableMetadata() {
    primaryKeys.clear();
    columnNames.clear();
    columnNamesLowerCase.clear();
    columnTypes.clear();

    Connection con = connectionProvider.getConnection();
    try {
      DatabaseMetaData metaData = con.getMetaData();

      String matchedDbName = null;

      ResultSet getTablesResultSet = metaData.getTables(null, null, "%", null);
      while(getTablesResultSet.next()) {
        String table = getTablesResultSet.getString(3);
        LOG.info("Checking table: " + table);
        if (this.tableName.equalsIgnoreCase(table)) {
          matchedDbName = table;
          ResultSet getColumnsResultSet = metaData.getColumns(null, null, table, null);
          while (getColumnsResultSet.next()) {
            String columnName = getColumnsResultSet.getString(4);
            String columnType = getColumnsResultSet.getString(6);
            columnNames.add(columnName);
            columnNamesLowerCase.add(columnName.toLowerCase());
            columnTypes.put(columnName.toLowerCase(),columnType);
            LOG.info(String.format("Found column: %s, %s", columnName, columnType));
          }
        }
      }

      if (matchedDbName != null) {
        ResultSet getExportedKeysResultSet = metaData.getPrimaryKeys(null, null, tableName);
        while (getExportedKeysResultSet.next()) {
          String columnName = getExportedKeysResultSet.getString(4);
          primaryKeys.add(columnName);
          LOG.info("Found primay key: " + columnName);
        }
      }

      if (!primaryKeys.isEmpty() && !columnNames.isEmpty()) {
        return;
      }

      ResultSet getCatalogsResult = metaData.getCatalogs();
      while (getCatalogsResult.next()) {
        String catalog = String.valueOf(getCatalogsResult.getObject(1));
        LOG.info("Checking catalog: " + catalog);
        ResultSet getSchemasResult = metaData.getSchemas(catalog, null);
        while (getSchemasResult.next()) {
          String schema = String.valueOf(getSchemasResult.getObject(1));
          LOG.info("Checking schema: " + schema);
          ResultSet getTablesResult = metaData.getTables(catalog, schema, null, null);
          while(getTablesResult.next()) {
            String table = getTablesResult.getString(3);
            LOG.info("Checking table: " + table);
            if (this.tableName.equalsIgnoreCase(table)) {
              if (matchedDbName == null) {
                matchedDbName = table;
              }
              if (columnNames.isEmpty()) {
                ResultSet getColumnsResultSet = metaData.getColumns(catalog, schema, table, null);
                while (getColumnsResultSet.next()) {
                  String columnName = getColumnsResultSet.getString(4);
                  String columnType = getColumnsResultSet.getString(6);
                  columnNames.add(columnName);
                  columnNamesLowerCase.add(columnName.toLowerCase());
                  columnTypes.put(columnName.toLowerCase(), columnType);
                  LOG.info(String.format("Found column: %s, %s", columnName, columnType));
                }
              }
            }
          }
        }
      }

      if (matchedDbName != null && primaryKeys.isEmpty()) {
        ResultSet getExportedKeysResultSet = metaData.getPrimaryKeys(null, null, tableName);
        while (getExportedKeysResultSet.next()) {
          String columnName = getExportedKeysResultSet.getString(4);
          primaryKeys.add(columnName);
          LOG.info("Found primay key: " + columnName);
        }
      }

      if (primaryKeys.isEmpty()) {
        LOG.warn(String.format("Jdbc table %s has no primary key. Writing to the table may cause duplicate rows.", tableName));
      }

      if (columnNames.isEmpty()) {
        throw new RuntimeException(String.format("Failed to get columns for jdbc table %s", tableName));
      }
    } catch (SQLException e) {
      throw new RuntimeException(String.format("Failed to get meta data for %s table %s", connectionProvider.getJdbcConnectionString(), tableName), e);
    }
  }

  private java.sql.Timestamp getSqlTimestamp(Object obj) {
    if (obj == null) {
      return null;
    }

    final long millis;

    if (obj instanceof Double) {
      millis = DateTimeUtils.getMillisSmart(((Double) obj).doubleValue());
    } else if (obj instanceof Float) {
      millis = DateTimeUtils.getMillisSmart(((Float)obj).doubleValue());
    } else if (obj instanceof Long) {
      millis = DateTimeUtils.getMillisSmart(((Long)obj).longValue());
    } else if (obj instanceof Integer) {
      millis = DateTimeUtils.getMillisSmart(((Integer)obj).longValue());
    } else {
      throw new RuntimeException(String.format("Cannot get sql timestamp from %s (%s)", obj, obj.getClass()));
    }

    return new java.sql.Timestamp(millis);
  }

}
