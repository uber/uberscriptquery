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

import com.uber.uscriptquery.antlr4.parsing.ActionParamValue;
import com.uber.uscriptquery.antlr4.parsing.ActionStatement;
import com.uber.uscriptquery.antlr4.parsing.ValueType;
import com.uber.uscriptquery.jdbc.JdbcUtils;
import junit.framework.Assert;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class UScriptQueryActionEngineTest {

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
    public void test_writeJdbc() throws IOException {

        StructField[] structFields = new StructField[]{
                new StructField("intColumn", DataTypes.IntegerType, true, Metadata.empty()),
                new StructField("stringColumn", DataTypes.StringType, true, Metadata.empty()),
                new StructField("longColumn", DataTypes.LongType, true, Metadata.empty()),
                new StructField("textColumn", DataTypes.StringType, true, Metadata.empty())
        };

        StructType structType = new StructType(structFields);

        List<Row> rows = new ArrayList<>();
        rows.add(RowFactory.create(1, "v1", 11L, "text1"));
        rows.add(RowFactory.create(2, "v2", 22L, "text2"));

        Dataset<Row> df = sparkSession.createDataFrame(rows, structType);
        df.registerTempTable("df1");

        ActionStatement actionStatement = new ActionStatement();
        actionStatement.setFunctionName("writeJdbc");

        File file = File.createTempFile("h2dbfile", ".db");
        file.deleteOnExit();

        String connectionString = String.format("jdbc:h2:%s;DB_CLOSE_DELAY=-1;MODE=MySQL", file.getAbsolutePath());

        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, connectionString));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "result1"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "INTcolumn"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "STRINGcolumn,LONGcolumn"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "textColumn"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "Append"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.Table, "df1"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "2"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "100000"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, ""));


        UScriptQueryActionEngine executor = new UScriptQueryActionEngine();
        executor.addActionStatementExecutor(WriteJdbcActionStatementExecutor.ACTION_NAME, new WriteJdbcActionStatementExecutor());
        executor.execute(actionStatement, sparkSession);

        List<List<Object>> queryResult = JdbcUtils.executeQuery(connectionString, "select * from result1");
        Assert.assertEquals(2, queryResult.size());
        Assert.assertEquals(4, queryResult.get(0).size());
        Assert.assertEquals(new Integer(1), queryResult.get(0).get(0));
        Assert.assertEquals("v1", queryResult.get(0).get(1));
        Assert.assertEquals(new Integer(2), queryResult.get(1).get(0));
        Assert.assertEquals("v2", queryResult.get(1).get(1));
    }

    @Test
    public void test_writeCsvFile() throws IOException {

        StructField[] structFields = new StructField[]{
                new StructField("intColumn", DataTypes.IntegerType, true, Metadata.empty()),
                new StructField("stringColumn", DataTypes.StringType, true, Metadata.empty()),
                new StructField("longColumn", DataTypes.LongType, true, Metadata.empty()),
                new StructField("textColumn", DataTypes.StringType, true, Metadata.empty())
        };

        StructType structType = new StructType(structFields);

        List<Row> rows = new ArrayList<>();
        rows.add(RowFactory.create(1, "v1", 11L, "text1"));
        rows.add(RowFactory.create(2, "v2", 22L, "text2"));

        Dataset<Row> df = sparkSession.createDataFrame(rows, structType);
        df.registerTempTable("df1");

        File file = File.createTempFile("test_output_file", ".tmp");
        String filePath = file.getAbsolutePath();

        file.delete();

        boolean fileExists = file.exists();
        Assert.assertFalse(fileExists);

        ActionStatement actionStatement = new ActionStatement();
        actionStatement.setFunctionName("writeCsvFile");
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, filePath));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "Append"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.Table, "df1"));

        UScriptQueryActionEngine executor = new UScriptQueryActionEngine();
        executor.addActionStatementExecutor(WriteCsvFileActionStatementExecutor.ACTION_NAME, new WriteCsvFileActionStatementExecutor());
        executor.execute(actionStatement, sparkSession);

        fileExists = file.exists();
        Assert.assertTrue(fileExists);

        file.delete();
    }

    @Test
    public void test_writeJsonFile() throws IOException {

        StructField[] structFields = new StructField[]{
                new StructField("intColumn", DataTypes.IntegerType, true, Metadata.empty()),
                new StructField("stringColumn", DataTypes.StringType, true, Metadata.empty()),
                new StructField("longColumn", DataTypes.LongType, true, Metadata.empty()),
                new StructField("textColumn", DataTypes.StringType, true, Metadata.empty())
        };

        StructType structType = new StructType(structFields);

        List<Row> rows = new ArrayList<>();
        rows.add(RowFactory.create(1, "v1", 11L, "text1"));
        rows.add(RowFactory.create(2, "v2", 22L, "text2"));

        Dataset<Row> df = sparkSession.createDataFrame(rows, structType);
        df.registerTempTable("df1");

        File file = File.createTempFile("test_output_file", ".tmp");
        String filePath = file.getAbsolutePath();

        file.delete();

        boolean fileExists = file.exists();
        Assert.assertFalse(fileExists);

        ActionStatement actionStatement = new ActionStatement();
        actionStatement.setFunctionName("writeJsonFile");
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, filePath));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "Append"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.Table, "df1"));

        UScriptQueryActionEngine executor = new UScriptQueryActionEngine();
        executor.addActionStatementExecutor(WriteJsonFileActionStatementExecutor.ACTION_NAME, new WriteJsonFileActionStatementExecutor());
        executor.execute(actionStatement, sparkSession);

        fileExists = file.exists();
        Assert.assertTrue(fileExists);

        file.delete();
    }

    @Test
    public void test_writeParquetFile() throws IOException {

        StructField[] structFields = new StructField[]{
                new StructField("intColumn", DataTypes.IntegerType, true, Metadata.empty()),
                new StructField("stringColumn", DataTypes.StringType, true, Metadata.empty()),
                new StructField("longColumn", DataTypes.LongType, true, Metadata.empty()),
                new StructField("textColumn", DataTypes.StringType, true, Metadata.empty())
        };

        StructType structType = new StructType(structFields);

        List<Row> rows = new ArrayList<>();
        rows.add(RowFactory.create(1, "v1", 11L, "text1"));
        rows.add(RowFactory.create(2, "v2", 22L, "text2"));

        Dataset<Row> df = sparkSession.createDataFrame(rows, structType);
        df.registerTempTable("df1");

        File file = File.createTempFile("test_output_file", ".tmp");
        String filePath = file.getAbsolutePath();

        file.delete();

        boolean fileExists = file.exists();
        Assert.assertFalse(fileExists);

        ActionStatement actionStatement = new ActionStatement();
        actionStatement.setFunctionName("writeParquetFile");
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, filePath));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, "Append"));
        actionStatement.getParamValues().add(new ActionParamValue(ValueType.Table, "df1"));

        UScriptQueryActionEngine executor = new UScriptQueryActionEngine();
        executor.addActionStatementExecutor(WriteParquetFileActionStatementExecutor.ACTION_NAME, new WriteParquetFileActionStatementExecutor());
        executor.execute(actionStatement, sparkSession);

        fileExists = file.exists();
        Assert.assertTrue(fileExists);

        file.delete();
    }

  /* Note: replace MailRun url and api key in following code with your own values to run this test.
  @Test
  public void test_sendMailgunEmail() throws IOException {
    StructField[] structFields = new StructField[] {
            new StructField("titleColumn", DataTypes.StringType, true, Metadata.empty()),
            new StructField("htmlColumn", DataTypes.StringType, true, Metadata.empty()),
    };

    StructType structType = new StructType(structFields);

    List<Row> rows = new ArrayList<>();
    rows.add(RowFactory.create("Email Title", "Email Html Body Line 1 <p/>"));
    rows.add(RowFactory.create("Email Title", "Email Html Body Line 2 <p/>"));

    Dataset<Row> df1 = sparkSession.createDataFrame(rows, structType);
    df1.createOrReplaceTempView("df1");

    sparkSession.sql("select titleColumn from df1 limit 1").createOrReplaceTempView("title_table");
    sparkSession.sql("select htmlColumn from df1").createOrReplaceTempView("html_table");

    String mailGunUrl = "https://api.mailgun.net/v3/sandbox549566ecba1d49fab0d7b53d4cfb01a4.mailgun.org/messages";
    String mailGunApiKey = "xxx";
    String fromEmail = "xxx@gmail.com";
    String toEmail = "xxx@gmail.com";

    ActionStatement actionStatement = new ActionStatement();
    actionStatement.setFunctionName("sendMailGunEmail");
    actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, mailGunUrl));
    actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, mailGunApiKey));
    actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, fromEmail));
    actionStatement.getParamValues().add(new ActionParamValue(ValueType.String, toEmail));
    actionStatement.getParamValues().add(new ActionParamValue(ValueType.Table, "title_table"));
    actionStatement.getParamValues().add(new ActionParamValue(ValueType.Table, "html_table"));

    UScriptQueryActionEngine executor = new UScriptQueryActionEngine();
    executor.addActionStatementExecutor(SendMailGunEmailActionStatementExecutor.ACTION_NAME, new SendMailGunEmailActionStatementExecutor());
    executor.execute(actionStatement, sparkSession);
  }
  */

}
