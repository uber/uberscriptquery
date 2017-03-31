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

import com.uber.uberscriptquery.antlr4.parsing.ActionStatement;
import com.uber.uberscriptquery.util.CredentialProvider;
import com.uber.uberscriptquery.util.SparkUtils;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteJdbcActionStatementExecutor implements ActionStatementExecutor {
    public static final String ACTION_NAME = "writeJdbc";
    private static final Logger logger = LoggerFactory.getLogger(WriteJdbcActionStatementExecutor.class);

    @Override
    public Object execute(SparkSession sparkSession, ActionStatement actionStatement, CredentialProvider credentialManager) {
        String connectionString = actionStatement.getParamValues().get(0).getValue().toString();
        String outputTableName = actionStatement.getParamValues().get(1).getValue().toString();
        String primaryKeysStr = actionStatement.getParamValues().get(2).getValue().toString();
        String indexColumnsStr = actionStatement.getParamValues().get(3).getValue().toString();
        String textColumnsStr = actionStatement.getParamValues().get(4).getValue().toString();
        String saveModeStr = actionStatement.getParamValues().get(5).getValue().toString();
        String dfTableName = actionStatement.getParamValues().get(6).getValue().toString();

        int dfPartitionCount = 1;
        if (actionStatement.getParamValues().size() > 7) {
            String str = actionStatement.getParamValues().get(7).getValue().toString();
            dfPartitionCount = Integer.parseInt(str);
        }

        double writesPerSecond = 100000;
        if (actionStatement.getParamValues().size() > 8) {
            writesPerSecond = Double.parseDouble(actionStatement.getParamValues().get(8).getValue().toString());
            logger.info(String.format("Use writesPerSecond: %s for db table %s", writesPerSecond, outputTableName));
        }

        String postWriteSql = null;
        if (actionStatement.getParamValues().size() > 9) {
            postWriteSql = actionStatement.getParamValues().get(9).getValue().toString();
        }

        List<String> primaryKeys = primaryKeysStr.isEmpty() ? new ArrayList<>() : Arrays.asList(primaryKeysStr.split(","));
        List<String> indexColumns = indexColumnsStr.isEmpty() ? new ArrayList<>() : Arrays.asList(indexColumnsStr.split(","));
        List<String> textColumns = textColumnsStr.isEmpty() ? new ArrayList<>() : Arrays.asList(textColumnsStr.split(","));

        SaveMode saveMode = SaveMode.valueOf(saveModeStr);

        String sql = String.format("select * from %s", dfTableName);
        logger.info(String.format("Running sql [%s] to get data and then save it", sql));
        Dataset<Row> df = sparkSession.sql(sql).coalesce(dfPartitionCount);
        SparkUtils.writeJdbc(df, connectionString, outputTableName, primaryKeys, indexColumns, textColumns, saveMode, postWriteSql, writesPerSecond);
        logger.info(String.format("Saved data [%s] to %s, %s", sql, outputTableName, saveMode));

        return null;
    }

}
