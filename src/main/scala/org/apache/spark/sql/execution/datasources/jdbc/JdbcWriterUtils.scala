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
 * Modified by Uber by copying from original file JdbcUtils.scala.
 * Modifications copyright (C) 2017 Uber
 *
 */

package org.apache.spark.sql.execution.datasources.jdbc

import java.sql.{Connection, Driver, DriverManager}
import java.util.Properties
import java.util.concurrent.Callable
import java.util.concurrent.atomic.AtomicLong

import com.uber.sparkscript.jdbc.SingleTableJdbcWriter
import com.uber.sparkscript.util.{SqlUtils, SparkUtils, ExponentialBackoffRetryPolicy}
import org.apache.commons.lang3.exception.ExceptionUtils
import org.apache.spark.internal.Logging
import org.apache.spark.sql.jdbc.{JdbcDialect, JdbcDialects, JdbcType}
import org.apache.spark.sql.types._
import org.apache.spark.sql.{DataFrame}
import org.spark_project.guava.util.concurrent.RateLimiter

import scala.collection.JavaConverters._

object JdbcWriterUtils extends Logging {

  def saveTable(
                  df: DataFrame,
                  url: String,
                  table: String,
                  textColumns: Seq[String],
                  postWriteSql: String,
                  retry: Boolean,
                  writesPerSecond: Double,
                  properties: Properties) {
    val dialect = JdbcDialects.get(url)
    val nullTypes: Array[Int] = df.schema.fields.map { field =>
      getJdbcType(field.dataType, dialect).jdbcNullType
    }

    val rddSchema = df.schema
    val columnNames = rddSchema.fields.map(_.name).toSeq.asJava

    val mapPartitionsResult = df.rdd.mapPartitions{ iterator =>
      logInfo(s"UberJdbcUtils.saveTable: $table")
      val rateLimiter = RateLimiter.create(writesPerSecond);
      try {
        val singleTableJdbcWriter = new SingleTableJdbcWriter(url, table, null, textColumns.asJava);

        val atomicLong = new AtomicLong()

        iterator.foreach(row => {
          atomicLong.incrementAndGet()
          val columnValues = row.toSeq.map(_.asInstanceOf[AnyRef]).asJava
          if (retry) {
            val retryPolicy: ExponentialBackoffRetryPolicy[String] = new ExponentialBackoffRetryPolicy[String](3, 100L)
            retryPolicy.attempt(new Callable[String] {
              override def call(): String = {
                rateLimiter.acquire()
                singleTableJdbcWriter.writeColumns(columnNames, columnValues)
                return null
              }
            })
          } else {
            singleTableJdbcWriter.writeColumns(columnNames, columnValues)
          }
        })

        Seq(atomicLong.longValue()).iterator
      } catch {
        case e: Throwable => {
          throw e
        }
      }
    }

    val rowCounts = mapPartitionsResult.collect()
    val totalSavedRows = rowCounts.sum
    logInfo(s"Saved $totalSavedRows rows to jdbc table $table")

    if (postWriteSql != null && !postWriteSql.isEmpty) {
      logInfo(s"Running post save sql: $postWriteSql")
      SqlUtils.executeJdbcUpdate(url, postWriteSql)
    }
  }

  private def createConnectionFactory(url: String, properties: Properties): () => Connection = {
    val userSpecifiedDriverClass = Option(properties.getProperty("driver"))
    userSpecifiedDriverClass.foreach(DriverRegistry.register)
    // Performing this part of the logic on the driver guards against the corner-case where the
    // driver returned for a URL is different on the driver and executors due to classpath
    // differences.
    val driverClass: String = userSpecifiedDriverClass.getOrElse {
      DriverManager.getDriver(url).getClass.getCanonicalName
    }
    () => {
      userSpecifiedDriverClass.foreach(DriverRegistry.register)
      val driver: Driver = DriverManager.getDrivers.asScala.collectFirst {
        case d: DriverWrapper if d.wrapped.getClass.getCanonicalName == driverClass => d
        case d if d.getClass.getCanonicalName == driverClass => d
      }.getOrElse {
        throw new IllegalStateException(
          s"Did not find registered driver with class $driverClass")
      }
      driver.connect(url, properties)
    }
  }

  private def getCommonJDBCType(dt: DataType): Option[JdbcType] = {
    dt match {
      case IntegerType => Option(JdbcType("INTEGER", java.sql.Types.INTEGER))
      case LongType => Option(JdbcType("BIGINT", java.sql.Types.BIGINT))
      case DoubleType => Option(JdbcType("DOUBLE PRECISION", java.sql.Types.DOUBLE))
      case FloatType => Option(JdbcType("REAL", java.sql.Types.FLOAT))
      case ShortType => Option(JdbcType("INTEGER", java.sql.Types.SMALLINT))
      case ByteType => Option(JdbcType("BYTE", java.sql.Types.TINYINT))
      case BooleanType => Option(JdbcType("BIT(1)", java.sql.Types.BIT))
      case StringType => Option(JdbcType("TEXT", java.sql.Types.CLOB))
      case BinaryType => Option(JdbcType("BLOB", java.sql.Types.BLOB))
      case TimestampType => Option(JdbcType("TIMESTAMP", java.sql.Types.TIMESTAMP))
      case DateType => Option(JdbcType("DATE", java.sql.Types.DATE))
      case t: DecimalType => Option(
        JdbcType(s"DECIMAL(${t.precision},${t.scale})", java.sql.Types.DECIMAL))
      case _ => None
    }
  }

  private def getJdbcType(dt: DataType, dialect: JdbcDialect): JdbcType = {
    dialect.getJDBCType(dt).orElse(getCommonJDBCType(dt)).getOrElse(
      throw new IllegalArgumentException(s"Can't get JDBC type for ${dt.simpleString}"))
  }

}
