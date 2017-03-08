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

package com.uber.sparkscript.util;

import com.uber.sparkscript.jdbc.DataSetResult;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlUtils {
  private static final Logger logger = Logger.getLogger(SqlUtils.class);

  public static boolean isTableNotExistExceptionMessage(String msg, String table) {
    {
      // Table 'dataquerier.airport_eta_ata_summary' doesn't exist
      Pattern p = Pattern.compile(String.format("^[Tt]able .*%s.* doesn't exist$$", table));
      Matcher m = p.matcher(msg);
      if (m.matches()) {
        return true;
      }
    }
    {
      // Table xxx not exist
      Pattern p = Pattern.compile(String.format("^[Tt]able .*%s.* not exist$$", table));
      Matcher m = p.matcher(msg);
      if (m.matches()) {
        return true;
      }
    }
    {
      // Table xxx not found
      Pattern p = Pattern.compile(String.format("^Table .*%s.* not found.*", table), Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.DOTALL);
      Matcher m = p.matcher(msg);
      if (m.matches()) {
        return true;
      }
    }
    return false;
  }

  public static String loadJdbcDriverClass(String jdbcUrl) {
    final String jdbcDriver;
    if (jdbcUrl.toLowerCase().startsWith("jdbc:h2:")) {
      jdbcDriver = "org.h2.Driver";
    } else if (jdbcUrl.toLowerCase().startsWith("jdbc:mysql:")) {
      jdbcDriver = com.mysql.jdbc.Driver.class.getName();
    } else {
      throw new RuntimeException("Unsupported jdbc url: " + jdbcUrl);
    }

    try {
      Class.forName(jdbcDriver);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException("Failed to load jdbc driver", e);
    }

    return jdbcDriver;
  }

  public static int executeJdbcUpdate(String jdbcUrl, String sql) {
    logger.info(String.format("Updating jdbc data by sql: %s", sql));

    loadJdbcDriverClass(jdbcUrl);

    try (Connection con = DriverManager.getConnection(jdbcUrl)) {
      PreparedStatement stmt = con.prepareStatement(sql);
      int rowCount = stmt.executeUpdate();
      logger.info(String.format("Finished db update sql: %s, row count: %s", sql, rowCount));
      return rowCount;
    } catch (SQLException e) {
      throw new RuntimeException("Failed to execute jdbc sql: " + sql, e);
    }
  }

  public static DataSetResult executeJdbcQuery(String jdbcUrl, String sql) {
    logger.info(String.format("Querying jdbc data by sql: %s", sql));

    loadJdbcDriverClass(jdbcUrl);

    DataSetResult dataSetResult = new DataSetResult();
    List<String> columnNames = new ArrayList<>();
    List<List<Object>> rows = new ArrayList<>();
    try (Connection con = DriverManager.getConnection(jdbcUrl)) {
      logger.info("Running sql: " + sql);
      try (Statement stmt = con.createStatement()) {
        try (ResultSet resultSet = stmt.executeQuery(sql)) {
          for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
            columnNames.add(resultSet.getMetaData().getColumnName(i + 1));
          }
          while (resultSet.next()) {
            List<Object> values = new ArrayList<>();
            for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
              Object value = resultSet.getObject(i + 1);
              values.add(value);
            }
            rows.add(values);
          }
          logger.info("Finished sql: " + sql);
          dataSetResult.setColumnNames(columnNames);
          dataSetResult.setRows(rows);
          return dataSetResult;
        }
      }
    } catch (SQLException e) {
      throw new RuntimeException(String.format("Failed to execute query sql: %s, %s", sql, e.getMessage()), e);
    }
  }
}
