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

package com.uber.uscriptquery.examples;

import com.uber.uscriptquery.execution.UScriptQueryEngine;
import com.uber.uscriptquery.util.HttpUtils;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;
import scala.Tuple2;

/**
 * This spark job takes a query and run it.
 * It takes a parameter "-query" to specify the query content, which could be a text, http url, or hdfs url.
 * It also takes a parameter "-queryOverwrite" which could overwrite the variable values in the query.
 */
public class UScriptQueryExampleJob {

    public static void main(String[] args) {
        String query = null;
        String queryOverwrite = null;

        // Read program arguments

        for (int i = 0; i < args.length; i++) {
            if (args[i].equalsIgnoreCase("-query")) {
                query = args[i + 1];
            } else if (args[i].equalsIgnoreCase("-queryOverwrite")) {
                queryOverwrite = args[i + 1];
            }
        }

        if (query == null) {
            query = "message = 'Hello World'; \n"
                    + "result = select cast(unix_timestamp() as timestamp) as time, '${message}' as message; \n"
                    + "printTable(result);";
        } else if (query.toLowerCase().startsWith("http://") || query.toLowerCase().startsWith("https://")) {
            System.out.println("Fetching query from http: " + query);
            query = HttpUtils.get(query, null).getBody();
        }

        System.out.println("Query: " + query);
        System.out.println("Query Overwrite: " + queryOverwrite);

        // Start Spark Session

        String master = "local[1]";
        String appName = "UScriptQueryExampleJob";

        SparkConf sparkConf = new SparkConf()
                .setMaster(master)
                .setAppName(appName);

        SparkSession sparkSession = SparkSession
                .builder()
                .config(sparkConf).getOrCreate();

        // Load query from hdfs if it is hdfs url
        if (query.toLowerCase().startsWith("hdfs://")) {
            System.out.println("Fetching query from hdfs: " + query);
            Tuple2<String, String>[] tuples = (Tuple2<String, String>[]) sparkSession.sparkContext().wholeTextFiles(query, 1).collect();
            query = tuples[0]._2();
            System.out.println("Query: " + query);
        }

        // Run query
        UScriptQueryEngine engine = new UScriptQueryEngine();
        engine.executeScript(query, queryOverwrite, sparkSession, false);

        sparkSession.stop();
    }
}
