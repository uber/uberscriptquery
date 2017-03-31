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

package com.uber.uberscriptquery.util;

import com.uber.uberscriptquery.jdbc.DataSetResult;
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

import java.util.ArrayList;
import java.util.List;

public class SparkUtilsTest {
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
    public void test_getDataSetResult() {

        StructField[] structFields = new StructField[]{
                new StructField("intColumn", DataTypes.IntegerType, true, Metadata.empty()),
                new StructField("stringColumn", DataTypes.StringType, true, Metadata.empty())
        };

        StructType structType = new StructType(structFields);

        List<Row> rows = new ArrayList<>();
        rows.add(RowFactory.create(1, "v1"));
        rows.add(RowFactory.create(2, "v2"));

        Dataset<Row> df = sparkSession.createDataFrame(rows, structType);

        DataSetResult dataSetResult = SparkUtils.getDataSetResult(df);
        Assert.assertEquals(2, dataSetResult.getColumnNames().size());
        Assert.assertEquals(2, dataSetResult.getRows().size());
        Assert.assertEquals(new Integer(1), dataSetResult.getRows().get(0).get(0));
        Assert.assertEquals("v1", dataSetResult.getRows().get(0).get(1));
        Assert.assertEquals(new Integer(2), dataSetResult.getRows().get(1).get(0));
        Assert.assertEquals("v2", dataSetResult.getRows().get(1).get(1));
    }
}
