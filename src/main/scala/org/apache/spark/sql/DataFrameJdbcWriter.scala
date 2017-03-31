/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Modified by Uber by copying from original file DataFrameWriter.scala.
 * Modifications copyright (C) 2017 Uber
 *
 */

package org.apache.spark.sql

import java.util.Properties

import org.apache.spark.sql.execution.datasources.jdbc.{JdbcUtils, JdbcWriterUtils}

import scala.collection.JavaConverters._

/**
  * Class used to write a [[Dataset]] to JDBC. This file is to mimic Spark DataFrameWriter, and provide
  * enhanced capabilities, for example, supporting primary keys and doing upsert based on the primary keys
  * to make JDBC write idempotent.
  *
  */
final class DataFrameJdbcWriter[T](ds: Dataset[T]) {

  private val df = ds.toDF()
  private var mode: SaveMode = SaveMode.ErrorIfExists

  /**
    * Specifies the behavior when data or table already exists. Options include:
    *   - `SaveMode.Overwrite`: overwrite the existing data.
    *   - `SaveMode.Append`: append the data.
    *   - `SaveMode.Ignore`: ignore the operation (i.e. no-op).
    *   - `SaveMode.ErrorIfExists`: default option, throw an exception at runtime.
    */
  def mode(saveMode: SaveMode): DataFrameJdbcWriter[T] = {
    this.mode = saveMode
    this
  }

  /**
    * Specifies the behavior when data or table already exists. Options include:
    *   - `overwrite`: overwrite the existing data.
    *   - `append`: append the data.
    *   - `ignore`: ignore the operation (i.e. no-op).
    *   - `error`: default option, throw an exception at runtime.
    */
  def mode(saveMode: String): DataFrameJdbcWriter[T] = {
    this.mode = saveMode.toLowerCase match {
      case "overwrite" => SaveMode.Overwrite
      case "append" => SaveMode.Append
      case "ignore" => SaveMode.Ignore
      case "error" | "default" => SaveMode.ErrorIfExists
      case _ => throw new IllegalArgumentException(s"Unknown save mode: $saveMode. " +
        "Accepted save modes are 'overwrite', 'append', 'ignore', 'error'.")
    }
    this
  }

  def jdbc(url: String, table: String, primaryKeys: java.util.List[String], indexColumns: java.util.List[String], textColumns: java.util.List[String], postWriteSql: String, writesPerSecond: Double, connectionProperties: Properties): Unit = {
    jdbc(url, table, primaryKeys.asScala.toSeq, indexColumns.asScala.toSeq, textColumns.asScala.toSeq, postWriteSql, writesPerSecond, connectionProperties)
  }

  ///////////////////////////////////////////////////////////////////////////////////////
  // Builder pattern config options
  ///////////////////////////////////////////////////////////////////////////////////////

  def jdbc(url: String, table: String, primaryKeys: Seq[String], indexColumns: Seq[String], textColumns: Seq[String], postWriteSql: String, writesPerSecond: Double, connectionProperties: Properties): Unit = {
    val props = new Properties()

    // connectionProperties should override settings in extraOptions
    props.putAll(connectionProperties)
    val conn = JdbcUtils.createConnectionFactory(url, props)()

    try {
      var tableExists = JdbcUtils.tableExists(conn, url, table)

      if (mode == SaveMode.Ignore && tableExists) {
        return
      }

      if (mode == SaveMode.ErrorIfExists && tableExists) {
        sys.error(s"Table $table already exists.")
      }

      if (mode == SaveMode.Overwrite && tableExists) {
        JdbcUtils.dropTable(conn, table)
        tableExists = false
      }

      // Create the table if the table didn't exist.
      if (!tableExists) {
        //val schema = JdbcUtils.schemaString(df, url)
        //val sql = s"CREATE TABLE $table ($schema)"
        val columnNames = df.schema.fields.map(_.name).toList.asJava
        val columnTypes = df.schema.fields.map(_.dataType).toList.asJava
        val sql = com.uber.uberscriptquery.jdbc.JdbcUtils.getCreateTableSql(
          columnNames, columnTypes, table, primaryKeys.toList.asJava, indexColumns.toList.asJava, textColumns.toList.asJava)
        val statement = conn.createStatement
        try {
          System.out.println(String.format("Creating jdbc table: %s", sql))
          statement.executeUpdate(sql)
          System.out.println(String.format("Created jdbc table: %s", sql))
        } finally {
          statement.close()
        }
      }
    } finally {
      conn.close()
    }

    val retry = if (primaryKeys.isEmpty) {
      false
    } else {
      true
    }
    System.out.println(String.format("Save to table %s with retry %s", table, String.valueOf(retry)))
    JdbcWriterUtils.saveTable(df, url, table, textColumns, postWriteSql, retry, writesPerSecond, props)
  }

}
