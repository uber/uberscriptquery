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

package com.uber.uberscriptquery.execution;

import com.uber.uberscriptquery.antlr4.parsing.*;
import com.uber.uberscriptquery.util.CredentialProvider;
import com.uber.uberscriptquery.util.DummyCredentialProvider;
import com.uber.uberscriptquery.util.SparkUtils;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.storage.StorageLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryEngine implements Serializable {
    public final static String DATAGEN_week_timepoints_by_10_minutes = "week_timepoints_by_10_minutes";
    public final static String DATAGEN_numbers_1k = "numbers_1k";
    private static final Logger logger = LoggerFactory.getLogger(QueryEngine.class);
    private CredentialProvider credentialManager = new DummyCredentialProvider();

    private Map<String, SqlInputStatementExecutor> sqlInputStatementExecutors = new HashMap<>();
    private Map<String, JsonInputStatementExecutor> jsonInputStatementExecutors = new HashMap<>();

    private Map<String, ActionStatementExecutor> actionStatementExecutors = new HashMap<>();

    public QueryEngine() {
        sqlInputStatementExecutors.put("jdbc", new JdbcSqlInputStatementExecutor());

        actionStatementExecutors.put(PrintTableActionStatementExecutor.ACTION_NAME, new PrintTableActionStatementExecutor());
        actionStatementExecutors.put(WriteJdbcActionStatementExecutor.ACTION_NAME, new WriteJdbcActionStatementExecutor());
        actionStatementExecutors.put(WriteCsvFileActionStatementExecutor.ACTION_NAME, new WriteCsvFileActionStatementExecutor());
        actionStatementExecutors.put(WriteJsonFileActionStatementExecutor.ACTION_NAME, new WriteJsonFileActionStatementExecutor());
        actionStatementExecutors.put(WriteParquetFileActionStatementExecutor.ACTION_NAME, new WriteParquetFileActionStatementExecutor());
        actionStatementExecutors.put(SendMailGunEmailActionStatementExecutor.ACTION_NAME, new SendMailGunEmailActionStatementExecutor());
    }

    private static Dataset<Row> generateData_week_timepoints_by_10_minutes(SparkSession spark) {
        StructField[] structFields = new StructField[1];
        org.apache.spark.sql.types.DataType dataType = DataTypes.IntegerType;
        String column = "timepoint";
        StructField structField = new StructField(column, dataType, true, Metadata.empty());
        structFields[0] = structField;

        StructType structType = new StructType(structFields);

        List<Row> rows = new ArrayList<>();

        int weekTotalMinutes = 7 * 24 * 60;
        int timepointIntervalMinutes = 10;
        for (int i = 0; i < weekTotalMinutes / timepointIntervalMinutes; i++) {
            Object[] objects = new Object[structFields.length];
            objects[0] = i;
            Row row = RowFactory.create(objects);
            rows.add(row);
        }

        Dataset<Row> df = spark.createDataFrame(rows, structType);
        return df;
    }

    private static Dataset<Row> generateData_numbers_1k(SparkSession spark) {
        StructField[] structFields = new StructField[1];
        org.apache.spark.sql.types.DataType dataType = DataTypes.IntegerType;
        String column = "number";
        StructField structField = new StructField(column, dataType, true, Metadata.empty());
        structFields[0] = structField;

        StructType structType = new StructType(structFields);

        List<Row> rows = new ArrayList<>();

        for (int i = 0; i <= 1000; i++) {
            Object[] objects = new Object[structFields.length];
            objects[0] = i;
            Row row = RowFactory.create(objects);
            rows.add(row);
        }

        Dataset<Row> df = spark.createDataFrame(rows, structType);
        return df;
    }

    public void setCredentialProvider(CredentialProvider credentialManager) {
        this.credentialManager = credentialManager;
    }

    public void addSqlInputStatementExecutor(String name, SqlInputStatementExecutor executor) {
        sqlInputStatementExecutors.put(name.toLowerCase(), executor);
    }

    public void addJsonInputStatementExecutor(String name, JsonInputStatementExecutor executor) {
        jsonInputStatementExecutors.put(name.toLowerCase(), executor);
    }

    public void addActionStatementExecutor(String name, ActionStatementExecutor executor) {
        actionStatementExecutors.put(name, executor);
    }

    public void executeScript(String query, SparkSession spark) {
        executeScript(query, null, spark, false);
    }

    public void executeScript(String query, String queryOverwrite, SparkSession spark, boolean debug) {
        QuerySqlParser parser = new QuerySqlParser();

        logger.info("Parsing query statement: " + query);
        RootStatement rootStatement = parser.parse(query, queryOverwrite).getRootStatement();

        if (rootStatement.getFileAssignments() != null) {
            for (FileAssignment fileAssignment : rootStatement.getFileAssignments()) {
                logger.info("Processing file input: " + fileAssignment);
                String inputFormat = fileAssignment.getFileType();
                String inputLocation = fileAssignment.getFileLocation();
                Dataset<Row> df = SparkUtils.loadFile(inputFormat, inputLocation, spark);
                logger.info("Finished loading file input: " + fileAssignment);

                processAndRegisterTempTable(df, rootStatement, fileAssignment.getTableAlias(), fileAssignment.toString(), debug);
            }
        }

        if (rootStatement.getJsonQueryStatementAssignments() != null) {
            for (StatementAssignment statementAssignment : rootStatement.getJsonQueryStatementAssignments()) {
                logger.info("Processing query statement: " + statementAssignment);
                JsonInputStatementExecutor jsonInputStatementExecutor = jsonInputStatementExecutors.get(statementAssignment.getQueryEngine().toLowerCase());
                if (jsonInputStatementExecutor == null) {
                    throw new RuntimeException("Not supported json query engine: " + statementAssignment.getQueryEngine());
                }

                Dataset<Row> df = jsonInputStatementExecutor.execute(spark, statementAssignment, this.credentialManager);
                logger.info("Finished query statement: " + statementAssignment);

                processAndRegisterTempTable(df, rootStatement, statementAssignment.getTableAlias(), statementAssignment.toString(), debug);
            }
        }

        if (rootStatement.getStatementAssignments() != null) {
            for (StatementAssignment statementAssignment : rootStatement.getStatementAssignments()) {
                logger.info("Processing query statement: " + statementAssignment);
                Dataset<Row> df;
                if (statementAssignment.getQueryType() == null) {
                    logger.info("Running query by spark sql: " + statementAssignment.getQueryText());
                    df = spark.sql(statementAssignment.getQueryText());
                } else if (statementAssignment.getQueryType().equalsIgnoreCase("SQL")) {
                    logger.info("Running query by SQL: " + statementAssignment);

                    SqlInputStatementExecutor sqlInputStatementExecutor = sqlInputStatementExecutors.get(statementAssignment.getQueryEngine().toLowerCase());
                    if (sqlInputStatementExecutor == null) {
                        throw new RuntimeException("Not supported sql query engine: " + statementAssignment.getQueryEngine());
                    }

                    df = sqlInputStatementExecutor.execute(spark, statementAssignment, this.credentialManager);
                } else if (statementAssignment.getQueryType().equalsIgnoreCase("JSON")) {
                    logger.info("Running query by JSON: " + statementAssignment);

                    JsonInputStatementExecutor jsonInputStatementExecutor = jsonInputStatementExecutors.get(statementAssignment.getQueryEngine().toLowerCase());
                    if (jsonInputStatementExecutor == null) {
                        throw new RuntimeException("Not supported json query engine: " + statementAssignment.getQueryEngine());
                    }

                    df = jsonInputStatementExecutor.execute(spark, statementAssignment, this.credentialManager);
                } else if (statementAssignment.getQueryType().equalsIgnoreCase("datagen")) {
                    logger.info("Running datagen: " + statementAssignment);
                    if (statementAssignment.getQueryEngine().equalsIgnoreCase(DATAGEN_week_timepoints_by_10_minutes)) {
                        df = generateData_week_timepoints_by_10_minutes(spark);
                    } else if (statementAssignment.getQueryEngine().equalsIgnoreCase(DATAGEN_numbers_1k)) {
                        df = generateData_numbers_1k(spark);
                    } else {
                        throw new RuntimeException("Query statement not supported for datagen: " + statementAssignment);
                    }
                } else {
                    throw new RuntimeException("Query statement not supported: " + statementAssignment);
                }
                logger.info("Finished query statement: " + statementAssignment);

                processAndRegisterTempTable(df, rootStatement, statementAssignment.getTableAlias(), statementAssignment.toString(), debug);
            }
        }

        QueryActionEngine actionExecutor = new QueryActionEngine();
        actionExecutor.setCredentialProvider(credentialManager);

        for (Map.Entry<String, ActionStatementExecutor> entry : actionStatementExecutors.entrySet()) {
            actionExecutor.addActionStatementExecutor(entry.getKey(), entry.getValue());
        }

        for (ActionStatement actionStatement : rootStatement.getActionStatements()) {
            logger.info("Running action statement: " + actionStatement);
            actionExecutor.execute(actionStatement, spark);
            logger.info("Finished action statement: " + actionStatement);
        }
    }

    private void processAndRegisterTempTable(Dataset<Row> df, RootStatement rootStatement, String tableAlias, String logText, boolean debug) {
        boolean dfPersisted = false;
        long tableReferenceCount = rootStatement.getTableReferenceCount().getCount(tableAlias);

        if (tableReferenceCount > 1) {
            df = df.persist(StorageLevel.MEMORY_AND_DISK_SER());
            dfPersisted = true;
            logger.info(String.format("Persist table %s because it is referenced %s times", tableAlias, tableReferenceCount));
        } else {
            logger.info(String.format("Do not persist table %s because it is referenced %s times", tableAlias, tableReferenceCount));
        }

        df.createOrReplaceTempView(tableAlias);
        logger.info(String.format("Registered temp view %s for query: %s", tableAlias, logText));

        if (debug) {
            if (!dfPersisted) {
                df = df.persist(StorageLevel.MEMORY_AND_DISK_SER());
            }

            // TODO save debug info/data
        }
    }
}
