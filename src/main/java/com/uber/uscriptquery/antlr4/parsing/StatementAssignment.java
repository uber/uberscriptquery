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

package com.uber.uscriptquery.antlr4.parsing;

import java.util.HashMap;
import java.util.Map;

public class StatementAssignment implements java.io.Serializable {
    public static final String QUERY_CONFIG_CONNECTION_STRING = "connectionString";
    public static final String QUERY_CONFIG_PASSWORD_FILE = "passwordFile";
    public static final String QUERY_CONFIG_PASSWORD_ENTRY = "passwordEntry";

    private String tableAlias;
    private String queryType;
    private String queryEngine;
    private String queryText;

    private Map<String, String> queryConfig = new HashMap<>();
    private String queryStatement;

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQueryEngine() {
        return queryEngine;
    }

    public void setQueryEngine(String queryEngine) {
        this.queryEngine = queryEngine;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public Map<String, String> getQueryConfig() {
        return queryConfig;
    }

    public void setQueryConfig(Map<String, String> queryConfig) {
        this.queryConfig = queryConfig;
    }

    public String getQueryStatement() {
        return queryStatement;
    }

    public void setQueryStatement(String queryStatement) {
        this.queryStatement = queryStatement;
    }

    @Override
    public String toString() {
        return "StatementAssignment{" +
                "tableAlias='" + tableAlias + '\'' +
                ", queryType='" + queryType + '\'' +
                ", queryEngine='" + queryEngine + '\'' +
                ", queryText='" + queryText + '\'' +
                ", queryConfig=" + queryConfig +
                ", queryStatement='" + queryStatement + '\'' +
                '}';
    }
}
