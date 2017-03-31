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

package com.uber.uscriptquery.execution;

import com.uber.uscriptquery.util.JsonFileCredentialProvider;
import com.uber.uscriptquery.util.SqlUtils;
import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class UScriptQueryEngineTest {
    private String master = "local[1]";
    private String appName = "spark_unit_test";

    private SparkConf sparkConf;
    private SparkSession sparkSession;

    @Before
    public void before() {
        sparkConf = new SparkConf()
                .setMaster(master)
                .setAppName(appName)
                .set("spark.driver.allowMultipleContexts", "true");

        sparkSession = SparkSession
                .builder()
                .config(sparkConf).getOrCreate();
    }

    @After
    public void after() {
        sparkSession.stop();
    }

    @Test
    public void test_executeScript_read_jdbc() throws IOException {
        File file = File.createTempFile("h2dbfile", ".db");
        file.deleteOnExit();

        String connectionString = String.format("jdbc:h2:%s;DB_CLOSE_DELAY=-1;MODE=MySQL", file.getAbsolutePath());

        SqlUtils.executeJdbcUpdate(connectionString, "create table table1(intColumn bigint, strColumn varchar(15))");
        SqlUtils.executeJdbcUpdate(connectionString, "insert into table1(intColumn, strColumn) values (11, 'str1')");

        File passwordFile = File.createTempFile("password", ".json");
        passwordFile.deleteOnExit();

        FileUtils.write(passwordFile, "{'jdbc': {'pwd': 'password1'}}");

        UScriptQueryEngine engine = new UScriptQueryEngine();
        engine.setCredentialProvider(new JsonFileCredentialProvider());
        String query = String.format(
                "source1 = SQL jdbc set connectionString='%s'; set passwordFile='%s'; set passwordEntry='$.jdbc.pwd'; select intColumn, strColumn from table1;",
                connectionString,
                passwordFile.getAbsolutePath());
        engine.executeScript(query, sparkSession);
        Dataset<Row> df = sparkSession.sql("select * from source1");
        Row[] rows = (Row[]) df.collect();
        Assert.assertEquals(1, rows.length);
        Assert.assertEquals(2, rows[0].size());
        Assert.assertEquals(new Long(11), rows[0].get(0));
        Assert.assertEquals("str1", rows[0].get(1));
    }

    @Test
    public void test_executeScript_read_jdbc_empty_passwordFile() throws IOException {
        File file = File.createTempFile("h2dbfile", ".db");
        file.deleteOnExit();

        String connectionString = String.format("jdbc:h2:%s;DB_CLOSE_DELAY=-1;MODE=MySQL", file.getAbsolutePath());

        SqlUtils.executeJdbcUpdate(connectionString, "create table table1(intColumn bigint, strColumn varchar(15))");
        SqlUtils.executeJdbcUpdate(connectionString, "insert into table1(intColumn, strColumn) values (11, 'str1')");

        File passwordFile = File.createTempFile("password", ".json");
        passwordFile.deleteOnExit();

        FileUtils.write(passwordFile, "{'jdbc': {'pwd': 'password1'}}");

        UScriptQueryEngine engine = new UScriptQueryEngine();
        String query = String.format(
                "source1 = SQL jdbc set connectionString='%s'; set passwordFile=''; set passwordEntry=''; select intColumn, strColumn from table1;",
                connectionString);
        engine.executeScript(query, sparkSession);
        Dataset<Row> df = sparkSession.sql("select * from source1");
        Row[] rows = (Row[]) df.collect();
        Assert.assertEquals(1, rows.length);
        Assert.assertEquals(2, rows[0].size());
        Assert.assertEquals(new Long(11), rows[0].get(0));
        Assert.assertEquals("str1", rows[0].get(1));
    }

    @Test
    public void test_executeBatchQuery_week_timepoints_by_10_minutes() {
        UScriptQueryEngine engine = new UScriptQueryEngine();
        String query = "source1 = datagen week_timepoints_by_10_minutes select timepoint from week_timepoints_by_10_minutes;result=select * from source1;";
        engine.executeScript(query, sparkSession);
        Dataset<Row> df = sparkSession.sql("select * from result");
        Row[] rows = (Row[]) df.collect();
        Assert.assertEquals(1008, rows.length);
        Assert.assertEquals(new Integer(0), rows[0].get(0));
        Assert.assertEquals(new Integer(1), rows[1].get(0));
        Assert.assertEquals(new Integer(1007), rows[1007].get(0));
    }

    @Test
    public void test_executeBatchQuery_numbers_1k() {
        UScriptQueryEngine engine = new UScriptQueryEngine();
        String query = "source1 = datagen numbers_1k select number from numbers_1k;result = select * from source1;";
        engine.executeScript(query, sparkSession);
        Dataset<Row> df = sparkSession.sql("select * from result");
        Row[] rows = (Row[]) df.collect();
        Assert.assertEquals(1001, rows.length);
        Assert.assertEquals(new Integer(0), rows[0].get(0));
        Assert.assertEquals(new Integer(1), rows[1].get(0));
        Assert.assertEquals(new Integer(1000), rows[1000].get(0));
    }


    @Test
    public void test_unix_timestamp() {
        UScriptQueryEngine engine = new UScriptQueryEngine();
        String query = "result=select unix_timestamp(split('2016-12-03T10:38:11.760000+00:00', '\\\\.')[0], \"yyyy-MM-dd'T'HH:mm:ss\") as timestamp;";
        engine.executeScript(query, sparkSession);
        Dataset<Row> df = sparkSession.sql("select * from result");
        Row[] rows = (Row[]) df.collect();
        Assert.assertEquals(1, rows.length);
        System.out.println("RESULT: " + rows[0].get(0));
    }
}
