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
import com.uber.uberscriptquery.util.DummyCredentialProvider;
import org.apache.spark.sql.SparkSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class QueryActionEngine {
    private static final Logger logger = LoggerFactory.getLogger(QueryActionEngine.class);

    private CredentialProvider credentialManager = new DummyCredentialProvider();

    private Map<String, ActionStatementExecutor> actionStatementExecutors = new HashMap<>();

    public void setCredentialProvider(CredentialProvider credentialManager) {
        this.credentialManager = credentialManager;
    }

    public void addActionStatementExecutor(String name, ActionStatementExecutor executor) {
        actionStatementExecutors.put(name, executor);
        logger.info(String.format("Added action executor %s for %s", executor.getClass().getName(), name));
    }

    public Object execute(ActionStatement actionStatement, SparkSession sparkSession) {
        ActionStatementExecutor actionStatementExecutor = actionStatementExecutors.get(actionStatement.getFunctionName());
        if (actionStatementExecutor != null) {
            return actionStatementExecutor.execute(sparkSession, actionStatement, this.credentialManager);
        } else {
            throw new RuntimeException(String.format("Unsupported action %s", actionStatement));
        }
    }

}
