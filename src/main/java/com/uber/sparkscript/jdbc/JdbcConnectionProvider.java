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

import com.uber.sparkscript.util.SqlUtils;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionProvider implements AutoCloseable {
  private static final Logger LOG = Logger.getLogger(JdbcConnectionProvider.class);

  private String jdbcConnectionString;

  private Connection connection;

  public JdbcConnectionProvider(String jdbcConnectionString) {
    this.jdbcConnectionString = jdbcConnectionString;
  }

  public String getJdbcConnectionString() {
    return jdbcConnectionString;
  }

  public synchronized Connection getConnection() {
    if (connection != null) {
      try {
        if (!connection.isClosed()) {
          return connection;
        }
      } catch (SQLException e) {
        LOG.warn(String.format("Failed to check whether jdbc connection is close: %s", jdbcConnectionString), e);
      }
    }

    SqlUtils.loadJdbcDriverClass(jdbcConnectionString);
    
    try {
      connection = DriverManager.getConnection(jdbcConnectionString);
      return connection;
    } catch (SQLException e) {
      throw new RuntimeException("Failed to create jdbc connection: " + jdbcConnectionString, e);
    }
  }

  @Override
  public synchronized void close() {
    if (connection != null) {
      try {
        connection.close();
        connection = null;
      } catch (SQLException e) {
        LOG.warn("Failed to close jdbc connection: " + jdbcConnectionString, e);
      }
    }
  }
}
