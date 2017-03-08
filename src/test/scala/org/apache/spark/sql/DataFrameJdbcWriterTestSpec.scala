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

package org.apache.spark.sql

import java.io.File
import java.util.Properties

import org.apache.spark.SparkConf
import org.apache.spark.sql.types.{StructType, Metadata, DataTypes, StructField}
import org.scalatest.{FunSpec, Matchers}

class DataFrameJdbcWriterTestSpec extends FunSpec with Matchers {

  describe("jdbc - with primary key") {
    it("should create jdb table and write data") {
      val master: String = "local[1]"
      val appName: String = "spark_unit_test"

      val sparkConf = new SparkConf().setMaster(master).setAppName(appName)
        .set("spark.driver.allowMultipleContexts", "true")

      val sparkSession = SparkSession.builder.config(sparkConf).getOrCreate

      val structFields: Array[StructField] = Array[StructField](
        new StructField("intColumn", DataTypes.IntegerType, true, Metadata.empty),
        new StructField("stringColumn", DataTypes.StringType, true, Metadata.empty),
        new StructField("textColumn", DataTypes.StringType, true, Metadata.empty))

      val structType: StructType = new StructType(structFields)

      val rows: java.util.List[Row] = new java.util.ArrayList[Row]
      rows.add(RowFactory.create(new Integer(1), "v1", "text1"))
      rows.add(RowFactory.create(new Integer(2), "v2", "text2"))

      val df: Dataset[Row] = sparkSession.createDataFrame(rows, structType)

      val dataFrameWriter = new DataFrameJdbcWriter[Row](df).mode(SaveMode.Append)


      val file: File = File.createTempFile("h2dbfile", ".db")
      file.deleteOnExit

      val connectionString: String = String.format("jdbc:h2:%s;DB_CLOSE_DELAY=-1;MODE=MySQL", file.getAbsolutePath)

      val properties: Properties = new Properties
      properties.put("driver", classOf[org.h2.Driver].getName)

      dataFrameWriter.jdbc(connectionString, "table1", Seq("intColumn"), Seq("stringColumn"), Seq("textColumn"), null, 100000, properties)

      var queryResult = com.uber.sparkscript.jdbc.JdbcUtils.executeQuery(connectionString, "select * from table1")
      assert(queryResult.size() === 2)
      assert(queryResult.get(0).size() === 3)

      dataFrameWriter.jdbc(connectionString, "table1", Seq("intColumn"), Seq("stringColumn"), Seq("textColumn"), null, 100000, properties)

      queryResult = com.uber.sparkscript.jdbc.JdbcUtils.executeQuery(connectionString, "select * from table1")
      assert(queryResult.size() === 2)
      assert(queryResult.get(0).size() === 3)

      dataFrameWriter.jdbc(connectionString, "table1", Seq("intColumn"), Seq("stringColumn"), Seq("textColumn"), "delete from table1", 100000, properties)

      queryResult = com.uber.sparkscript.jdbc.JdbcUtils.executeQuery(connectionString, "select * from table1")
      assert(queryResult.size() === 0)

      sparkSession.stop()
    }
  }

  describe("jdbc - with primary key and null values for non primary keys") {
    it("should create jdb table and write data") {
      val master: String = "local[1]"
      val appName: String = "spark_unit_test"

      val sparkConf = new SparkConf().setMaster(master).setAppName(appName)
        .set("spark.driver.allowMultipleContexts", "true")

      val sparkSession = SparkSession.builder.config(sparkConf).getOrCreate

      val structFields: Array[StructField] = Array[StructField](
        new StructField("intColumn", DataTypes.IntegerType, true, Metadata.empty),
        new StructField("stringColumn", DataTypes.StringType, true, Metadata.empty),
        new StructField("textColumn", DataTypes.StringType, true, Metadata.empty))

      val structType: StructType = new StructType(structFields)

      val rows: java.util.List[Row] = new java.util.ArrayList[Row]
      rows.add(RowFactory.create(new Integer(1), "v1", "text1"))
      rows.add(RowFactory.create(new Integer(2), "v2", null))
      rows.add(RowFactory.create(new Integer(3), "v3", "text3"))

      val df: Dataset[Row] = sparkSession.createDataFrame(rows, structType)

      val dataFrameWriter = new DataFrameJdbcWriter[Row](df)


      val file: File = File.createTempFile("h2dbfile", ".db")
      file.deleteOnExit

      val connectionString: String = String.format("jdbc:h2:%s;DB_CLOSE_DELAY=-1;MODE=MySQL", file.getAbsolutePath)

      val properties: Properties = new Properties
      properties.put("driver", classOf[org.h2.Driver].getName)

      dataFrameWriter.jdbc(connectionString, "table1", Seq("intColumn", "stringColumn"), Seq("intColumn", "stringColumn"), Seq(), null, 100000, properties)

      val queryResult = com.uber.sparkscript.jdbc.JdbcUtils.executeQuery(connectionString, "select * from table1")
      assert(queryResult.size() === 3)
      assert(queryResult.get(0).size() === 3)

      sparkSession.stop()
    }
  }

  describe("jdbc - without primary key") {
    it("should create jdb table and write data") {
      val master: String = "local[1]"
      val appName: String = "spark_unit_test"

      val sparkConf = new SparkConf().setMaster(master).setAppName(appName)
        .set("spark.driver.allowMultipleContexts", "true")

      val sparkSession = SparkSession.builder.config(sparkConf).getOrCreate

      val structFields: Array[StructField] = Array[StructField](
        new StructField("intColumn", DataTypes.IntegerType, true, Metadata.empty),
        new StructField("stringColumn", DataTypes.StringType, true, Metadata.empty),
        new StructField("textColumn", DataTypes.StringType, true, Metadata.empty))

      val structType: StructType = new StructType(structFields)

      val rows: java.util.List[Row] = new java.util.ArrayList[Row]
      rows.add(RowFactory.create(new Integer(1), "v1", "text1"))
      rows.add(RowFactory.create(new Integer(2), "v2", "text2"))

      val df: Dataset[Row] = sparkSession.createDataFrame(rows, structType)

      val dataFrameWriter = new DataFrameJdbcWriter[Row](df)


      val file: File = File.createTempFile("h2dbfile", ".db")
      file.deleteOnExit

      val connectionString: String = String.format("jdbc:h2:%s;DB_CLOSE_DELAY=-1;MODE=MySQL", file.getAbsolutePath)

      val properties: Properties = new Properties
      properties.put("driver", classOf[org.h2.Driver].getName)

      dataFrameWriter.jdbc(connectionString, "table1", Seq[String](), Seq[String](), Seq("textColumn"), null, 100000, properties)

      val queryResult = com.uber.sparkscript.jdbc.JdbcUtils.executeQuery(connectionString, "select * from table1")
      assert(queryResult.size() === 2)
      assert(queryResult.get(0).size() === 3)

      sparkSession.stop()
    }
  }
}
