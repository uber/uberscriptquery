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

package com.uber.uscriptquery.util;

import com.uber.uscriptquery.jdbc.DataSetResult;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.*;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.storage.StorageLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.Tuple2;

import java.sql.*;
import java.util.*;

public class SparkUtils {
    public final static String HDFS_PREFIX_LOWERCASE = "hdfs://";
    private static final Logger logger = LoggerFactory.getLogger(SparkUtils.class);

    public static Dataset<Row> loadFile(String inputFormat, String inputPath, SparkSession spark) {
        if (inputFormat == null || inputFormat.isEmpty() || inputFormat.equalsIgnoreCase("text")) {
            return spark.read().text(inputPath);
        } else if (inputFormat.equalsIgnoreCase("parquet")) {
            return spark.read().parquet(inputPath);
        } else if (inputFormat.equalsIgnoreCase("csv")) {
            return spark.read().option("header", "false").csv(inputPath);
        } else if (inputFormat.equalsIgnoreCase("csv_with_header")) {
            return spark.read().option("header", "true").csv(inputPath);
        } else if (inputFormat.equalsIgnoreCase("json")) {
            return spark.read().json(inputPath);
        } else {
            throw new RuntimeException(String.format("Unsupported inputFormat: %s, %s", inputFormat, inputPath));
        }
    }

    public static void writeParquet(Dataset<Row> df, String outputPath, SaveMode saveMode, int numPartitions) {
        logger.info(String.format("Saving parquet file %s, saveMode: %s, numPartitions: %s", outputPath, saveMode, numPartitions));
        String hdfsOutputPath = outputPath;
        if (hdfsOutputPath.toLowerCase().startsWith(HDFS_PREFIX_LOWERCASE)) {
            hdfsOutputPath = hdfsOutputPath.substring(HDFS_PREFIX_LOWERCASE.length());
        }
        df.coalesce(numPartitions).write().mode(saveMode).parquet(hdfsOutputPath);
        logger.info(String.format("Saved parquet file %s, saveMode: %s, numPartitions: %s", outputPath, saveMode, numPartitions));
    }

    // There is always issue like following when use spark.read().format("jdbc").options(jdbcMap).load(), so we write our own to load data from jdbc.
    // 16/09/20 00:16:19 ERROR yarn.ApplicationMaster: User class threw exception: com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '...' at line 1
    // com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'SELECT city_name FROM dataquerier.fifo_supplies_01 WHERE 1=0' at line 1
    public static Dataset<Row> readJdbc(String jdbcUrlWithPassword, String sql, SparkSession spark) {
        JavaRDD<Tuple2<List<Row>, StructType>> javaRdd1 = JavaSparkContext.fromSparkContext(spark.sparkContext())
                .parallelize(Arrays.asList(0))
                .map(new Function<Integer, Tuple2<List<Row>, StructType>>() {
                    @Override
                    public Tuple2<List<Row>, StructType> call(Integer v1) throws Exception {
                        Tuple2<List<Row>, StructType> tuple = new ExponentialBackoffRetryPolicy<Tuple2<List<Row>, StructType>>(3, 100)
                                .attempt(() -> readJdbcAndReturnRowsAndSchema(jdbcUrlWithPassword, sql));
                        return tuple;
                    }
                });

        javaRdd1 = javaRdd1.persist(StorageLevel.DISK_ONLY_2());

        StructType structType = javaRdd1.map(new Function<Tuple2<List<Row>, StructType>, StructType>() {
            @Override
            public StructType call(Tuple2<List<Row>, StructType> v1) throws Exception {
                return v1._2();
            }
        }).collect().get(0);

        JavaRDD<Row> javaRdd2 = javaRdd1.flatMap(new FlatMapFunction<Tuple2<List<Row>, StructType>, Row>() {
            @Override
            public Iterator<Row> call(Tuple2<List<Row>, StructType> listStructTypeTuple2) throws Exception {
                return listStructTypeTuple2._1().iterator();
            }
        });

        return spark.createDataFrame(javaRdd2, structType);

        //SqlUtils.loadJdbcDriverClass(jdbcUrlWithPassword);
        //DriverRegistryWrapper.register(com.mysql.jdbc.Driver.class.getName());
        //ExponentialBackoffRetryPolicy<Dataset<Row>> retryPolicy = new ExponentialBackoffRetryPolicy<>(3, 100);
        //return retryPolicy.attempt(() -> readJdbcWithoutRetry(jdbcUrlWithPassword, sql, spark));
    }

    //private static Dataset<Row> readJdbcWithoutRetry(String jdbcUrlWithPassword, String sql, SparkSession spark) {
    //  Tuple2<List<Row>, StructType> tuple2 = readJdbcAndReturnRowsAndSchema(jdbcUrlWithPassword, sql);
    //  Dataset<Row> df = spark.createDataFrame(tuple2._1(), tuple2._2());
    //  return df;
    //}

    private static Tuple2<List<Row>, StructType> readJdbcAndReturnRowsAndSchema(String jdbcUrlWithPassword, String sql) {
        SqlUtils.loadJdbcDriverClass(jdbcUrlWithPassword);
        logger.info("Running jdbc sql: " + sql);
        try (Connection con = DriverManager.getConnection(jdbcUrlWithPassword)) {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();
            logger.info(String.format("Finished jdbc sql: %s", sql));

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int[] sqlTypes = new int[resultSetMetaData.getColumnCount()];
            StructField[] structFields = new StructField[resultSetMetaData.getColumnCount()];
            for (int i = 0; i < structFields.length; i++) {
                int sqlType = resultSetMetaData.getColumnType(i + 1);
                sqlTypes[i] = sqlType;
                org.apache.spark.sql.types.DataType dataType = convertSqlTypeToSparkSqlDataType(sqlType);
                String column = resultSetMetaData.getColumnName(i + 1);
                StructField structField = new StructField(column, dataType, true, Metadata.empty());
                structFields[i] = structField;
            }

            StructType structType = new StructType(structFields);

            List<Row> rows = new ArrayList<>();

            while (resultSet.next()) {
                Object[] objects = new Object[structFields.length];
                for (int i = 0; i < structFields.length; i++) {
                    Object obj = resultSet.getObject(i + 1);
                    objects[i] = obj;
                }
                Row row = RowFactory.create(objects);
                rows.add(row);

                if (rows.size() == 1 || rows.size() % 5000 == 0) {
                    logger.info(String.format("Read %s rows from sql result", rows.size()));
                }
            }

            logger.info(String.format("Got %s rows from sql result: %s", rows.size(), sql));

            return new Tuple2<>(rows, structType);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to execute jdbc sql: " + sql, e);
        }
    }

    public static org.apache.spark.sql.types.DataType convertSqlTypeToSparkSqlDataType(int sqlType) {
        if (sqlType == java.sql.Types.BOOLEAN) {
            return DataTypes.BooleanType;
        } else if (sqlType == Types.TINYINT) {
            return DataTypes.ByteType;
        } else if (sqlType == Types.SMALLINT) {
            return DataTypes.ShortType;
        } else if (sqlType == java.sql.Types.INTEGER) {
            return DataTypes.IntegerType;
        } else if (sqlType == java.sql.Types.BIGINT) {
            return DataTypes.LongType;
        } else if (sqlType == Types.DECIMAL) {
            return DataTypes.createDecimalType();
        } else if (sqlType == java.sql.Types.FLOAT) {
            return DataTypes.FloatType;
        } else if (sqlType == java.sql.Types.DOUBLE) {
            return DataTypes.DoubleType;
        } else if (sqlType == Types.DATE) {
            return DataTypes.DateType;
        } else if (sqlType == Types.TIME) {
            return DataTypes.TimestampType;
        } else if (sqlType == Types.TIMESTAMP) {
            return DataTypes.TimestampType;
        } else if (sqlType == java.sql.Types.VARCHAR) {
            return DataTypes.StringType;
        } else {
            logger.warn(String.format("Using string for unsupported sql type %s", sqlType));
            return DataTypes.StringType;
        }
    }

    public static DataSetResult getDataSetResult(Dataset<Row> df) {
        DataSetResult result = new DataSetResult();

        String[] fieldNames = df.schema().fieldNames();

        result.getColumnNames().addAll(Arrays.asList(fieldNames));

        Row[] rows = (Row[]) df.collect();
        for (Row row : rows) {
            List<Object> values = new ArrayList<>();
            for (int i = 0; i < fieldNames.length; i++) {
                Object obj = row.get(i);
                values.add(obj);
            }
            result.getRows().add(values);
        }

        return result;
    }

    public static void writeJdbc(Dataset<Row> df, String jdbcUrl, String tableName, List<String> primaryKeys, List<String> indexColumns, List<String> textColumns, SaveMode saveMode, String postWriteSql, double writesPerSecond) {
        logger.info(String.format("Saving to jdbc table %s, saveMode: %s", tableName, saveMode));

        String jdbcDriver = SqlUtils.loadJdbcDriverClass(jdbcUrl);

        try {
            DriverManager.getConnection(jdbcUrl).close();
        } catch (SQLException e) {
            throw new RuntimeException("Failed to open jdbc connection", e);
        }

        org.apache.spark.sql.execution.datasources.jdbc.DriverRegistry.register(com.mysql.jdbc.Driver.class.getName());
        Properties properties = new Properties();
        properties.put("driver", jdbcDriver);
        (new DataFrameJdbcWriter(df)).mode(saveMode).jdbc(jdbcUrl, tableName, primaryKeys, indexColumns, textColumns, postWriteSql, writesPerSecond, properties);
        logger.info(String.format("Saved to jdbc table %s, saveMode: %s", tableName, saveMode));
    }

    public static DataSetResult getTableData(SparkSession sparkSession, String tableName) {
        String sql = String.format("select * from %s", tableName);
        logger.info(String.format("Running sql [%s] to get data", sql));
        Dataset<Row> df = sparkSession.sql(sql);
        DataSetResult dataSetResult = SparkUtils.getDataSetResult(df);
        logger.info(String.format("Finished sql [%s] to get data", sql));
        return dataSetResult;
    }
}
