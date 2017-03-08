package com.uber.sparkscript.execution;

import com.uber.sparkscript.antlr4.parsing.ActionStatement;
import com.uber.sparkscript.util.CredentialProvider;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WriteCsvFileActionStatementExecutor implements ActionStatementExecutor {
    public static final String ACTION_NAME = "writeCsvFile";
    private static final Logger logger = LoggerFactory.getLogger(WriteCsvFileActionStatementExecutor.class);

    @Override
    public Object execute(SparkSession sparkSession, ActionStatement actionStatement, CredentialProvider credentialManager) {

        String filePath = actionStatement.getParamValues().get(0).getValue().toString();
        String saveModeStr = actionStatement.getParamValues().get(1).getValue().toString();
        String dfTableName = actionStatement.getParamValues().get(2).getValue().toString();

        SaveMode saveMode = SaveMode.valueOf(saveModeStr);

        String sql = String.format("select * from %s", dfTableName);
        logger.info(String.format("Running sql [%s] to get data and then save it", sql));
        Dataset<Row> df = sparkSession.sql(sql);

        logger.info(String.format("Saving to csv %s, saveMode: %s", filePath, saveMode));
        df.coalesce(1).write().mode(saveMode).option("header", "false").csv(filePath);
        logger.info(String.format("Saved to csv %s, saveMode: %s", filePath, saveMode));
        return null;
    }
}
