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

package com.uber.sparkscript.examples;

import com.uber.sparkscript.execution.SparkScriptEngine;
import com.uber.sparkscript.jdbc.DataSetResult;
import com.uber.sparkscript.util.JsonUtils;
import com.uber.sparkscript.util.SqlUtils;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * This class contains example codes to use SparkScriptEngine to run Spark Script.
 */
public class SparkScriptExecutionExample {

  public static void main(String[] args) {
    // Prepare data as the input for the Spark Script.
    // This is just for demonstration. In real scenario, you will have your own data in database, hadoop, or other places.
    String connectionString = prepareJdbcData();
    String jsonFile = prepareJsonFile();

    // Start Spark Session

    String master = "local[1]";
    String appName = "SparkScriptExecutionExample";

    SparkConf sparkConf = new SparkConf()
            .setMaster(master)
            .setAppName(appName);

    SparkSession sparkSession = SparkSession
            .builder()
            .config(sparkConf).getOrCreate();

    // Set log level to avoid too many outputs
    sparkSession.sparkContext().setLogLevel("ERROR");

    // Spark Script to run
    String script =
            String.format("clients = sql jdbc set connectionString='%s'; select clientId, clientName from dim_client; \n", connectionString)
            + String.format("orders = file json file://%s; \n", jsonFile)
            + "result = select clientName,productName,totalCount from orders join clients on clients.clientId = orders.clientId; \n"
            + String.format("writeJdbc('%s', 'jdbcTable', 'clientName,productName', 'clientName,productName', '', 'Append', result);", connectionString);

    System.out.println("-----------------------------------------------");
    System.out.println("Running Spark Script");
    System.out.println("-----------------------------------------------");
    System.out.println(script);
    System.out.println("-----------------------------------------------");

    // Run Spark Script
    SparkScriptEngine engine = new SparkScriptEngine();
    engine.executeScript(script, sparkSession);

    // The data should be written into the database by Spark Script writeJdbc action.
    // Let's query it and print it out.
    DataSetResult dataResult = SqlUtils.executeJdbcQuery(connectionString, "select * from jdbcTable");
    System.out.println("-----------------------------------------------");
    System.out.println("Data in jdbc table after executing Spark Script");
    System.out.println("-----------------------------------------------");
    dataResult.print();
    System.out.println("-----------------------------------------------");

    sparkSession.stop();
  }


  private static String prepareJdbcData() {
    File file;
    try {
      file = File.createTempFile("h2dbfile", ".db");
    } catch (IOException e) {
      throw new RuntimeException("Failed to create temp file", e);
    }
    file.deleteOnExit();

    String connectionString = String.format("jdbc:h2:%s;DB_CLOSE_DELAY=-1;MODE=MySQL", file.getAbsolutePath());

    SqlUtils.executeJdbcUpdate(connectionString, "create table dim_client(clientId bigint, clientName varchar(15))");
    SqlUtils.executeJdbcUpdate(connectionString, "insert into dim_client(clientId, clientName) values (1, 'client1')");
    SqlUtils.executeJdbcUpdate(connectionString, "insert into dim_client(clientId, clientName) values (2, 'client2')");
    SqlUtils.executeJdbcUpdate(connectionString, "insert into dim_client(clientId, clientName) values (3, 'client3')");

    return connectionString;
  }

  private static String prepareJsonFile() {
    File file;
    try {
      file = File.createTempFile("test_file", ".json");
    } catch (IOException e) {
      throw new RuntimeException("Failed to create temp file", e);
    }
    file.deleteOnExit();

    try (FileOutputStream outputStream = new FileOutputStream(file)) {
      Random random = new Random();
      for (int i = 1; i <= 100; i++) {
        Map<String, Object> jsonRecord = new HashMap<>();
        jsonRecord.put("clientId", i);
        jsonRecord.put("productName", "product_" + random.nextInt(100));
        jsonRecord.put("totalCount", random.nextInt(100));

        String jsonString = JsonUtils.serialize(jsonRecord) + "\n";
        outputStream.write(jsonString.getBytes(StandardCharsets.UTF_8));
      }
      outputStream.flush();
      outputStream.close();
    } catch (IOException e) {
      throw new RuntimeException("Failed to write to file " + file.getAbsolutePath(), e);
    }

    return file.getAbsolutePath();
  }
}
