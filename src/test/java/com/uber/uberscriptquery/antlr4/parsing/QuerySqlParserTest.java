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

package com.uber.uberscriptquery.antlr4.parsing;

import com.uber.uberscriptquery.util.ResourceUtils;
import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class QuerySqlParserTest {
    @Test
    public void test_parseRootStatement_load_from_QueryFile001() throws IOException {
        String text = ResourceUtils.readResource(this.getClass(), "QueryFile001.txt");
        Assert.assertNotNull(text);

        QuerySqlParser parser = new QuerySqlParser();
        QuerySqlParseResult parseResult = parser.parse(text);
        Assert.assertNotNull(parseResult);
    }

    @Test
    public void test_parseRootStatement_single_statement() throws IOException {
        String query = "result = select a, c from source1;";

        QuerySqlParser parser = new QuerySqlParser();
        RootStatement rootStatement = parser.parseRootStatement(query);
        Assert.assertEquals(1, rootStatement.getStatementAssignments().size());

        Assert.assertEquals(0, rootStatement.getTableReferenceCount().getCount("source"));
        Assert.assertEquals(1, rootStatement.getTableReferenceCount().getCount("source1"));
    }

    @Test
    public void test_parseRootStatement_sqlQueryType() throws IOException {
        {
            String query = "source1 = SQL engine1 select a,b,c from geofence; result = select a, c from source1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(2, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("source1", statementAssignment.getTableAlias());
            Assert.assertEquals("SQL", statementAssignment.getQueryType());
            Assert.assertEquals("engine1", statementAssignment.getQueryEngine());
            Assert.assertEquals("select a,b,c from geofence", statementAssignment.getQueryText());

            Assert.assertEquals(1, rootStatement.getTableReferenceCount().getCount("source1"));
        }
        {
            String query = "source1 = SQL engine1 select a,b,c from geofence; t1 = select a, b, c from source1; result = select a, c from source1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(3, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("source1", statementAssignment.getTableAlias());
            Assert.assertEquals("SQL", statementAssignment.getQueryType());
            Assert.assertEquals("engine1", statementAssignment.getQueryEngine());
            Assert.assertEquals("select a,b,c from geofence", statementAssignment.getQueryText());

            statementAssignment = rootStatement.getStatementAssignments().get(1);
            Assert.assertEquals("t1", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select a, b, c from source1", statementAssignment.getQueryText());
        }
    }

    @Test
    public void test_parseRootStatement_withQueryConfig() throws IOException {
        {
            String query = "source1 = SQL engine1 set hive.strict.checks.large.query = false; select a,b,c from geofence; result = select a, c from source1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(2, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("source1", statementAssignment.getTableAlias());
            Assert.assertEquals("SQL", statementAssignment.getQueryType());
            Assert.assertEquals("engine1", statementAssignment.getQueryEngine());
            Assert.assertEquals("set hive.strict.checks.large.query = false; select a,b,c from geofence", statementAssignment.getQueryText());

            Assert.assertEquals(1, rootStatement.getTableReferenceCount().getCount("source1"));
        }
    }

    @Test
    public void test_parseRootStatement_datagen() throws IOException {
        {
            String query = "source1 = datagen week_timepoints_by_10_minutes select *;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(1, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("source1", statementAssignment.getTableAlias());
            Assert.assertEquals("datagen", statementAssignment.getQueryType());
            Assert.assertEquals("week_timepoints_by_10_minutes", statementAssignment.getQueryEngine());
            Assert.assertEquals("select *", statementAssignment.getQueryText());
        }
    }

    @Test
    public void test_parseRootStatement_variable_assignment() throws IOException {
        {
            String query = "v1 = 'abc'; result = select a, c from source1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(1, rootStatement.getStatementAssignments().size());
        }
        {
            String query = "v1 = 'abc'; v2 = \"def\"; source1 = SQL engine1 select a,b,c from geofence; t1 = select a, b, c from source1; result = select a, c from source1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(3, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("source1", statementAssignment.getTableAlias());
            Assert.assertEquals("SQL", statementAssignment.getQueryType());
            Assert.assertEquals("engine1", statementAssignment.getQueryEngine());
            Assert.assertEquals("select a,b,c from geofence", statementAssignment.getQueryText());

            statementAssignment = rootStatement.getStatementAssignments().get(1);
            Assert.assertEquals("t1", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select a, b, c from source1", statementAssignment.getQueryText());
        }
    }

    @Test
    public void test_parseRootStatement_file_assignment() throws IOException {
        {
            String query = "source1 = file parquet hdfs:///dir/*; result = select a, c from source1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(1, rootStatement.getFileAssignments().size());
            Assert.assertEquals(1, rootStatement.getStatementAssignments().size());

            Assert.assertEquals("source1", rootStatement.getFileAssignments().get(0).getTableAlias());
            Assert.assertEquals("parquet", rootStatement.getFileAssignments().get(0).getFileType());
            Assert.assertEquals("hdfs:///dir/*", rootStatement.getFileAssignments().get(0).getFileLocation());
        }
        {
            String query = "source1 = file json file:///dir/*; result = select a, c from source1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(1, rootStatement.getFileAssignments().size());
            Assert.assertEquals(1, rootStatement.getStatementAssignments().size());

            Assert.assertEquals("source1", rootStatement.getFileAssignments().get(0).getTableAlias());
            Assert.assertEquals("json", rootStatement.getFileAssignments().get(0).getFileType());
            Assert.assertEquals("file:///dir/*", rootStatement.getFileAssignments().get(0).getFileLocation());
        }
    }

    @Test
    public void test_parseRootStatement_variable_assignment_complicated() throws IOException {
        {
            String query = "v1 = 'abc'; v2 = \"def\"; source1 = SQL engine1 select a,b,c from geofence where a>'0'; t1 = select a, b, c from source1 where b = 'cd'; result = select a, c from source1 where c =\"ef\";";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(3, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("source1", statementAssignment.getTableAlias());
            Assert.assertEquals("SQL", statementAssignment.getQueryType());
            Assert.assertEquals("engine1", statementAssignment.getQueryEngine());
            Assert.assertEquals("select a,b,c from geofence where a>'0'", statementAssignment.getQueryText());

            statementAssignment = rootStatement.getStatementAssignments().get(1);
            Assert.assertEquals("t1", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select a, b, c from source1 where b = 'cd'", statementAssignment.getQueryText());
        }
        {
            String query = "v1 = '123'; v2 = \"def\"; source1 = SQL engine1 select a,b,c from geofence where a>'0'; t1 = select a, b, c from source1 where b = ${v1}; result = select a, c from source1 where c =\"${v2}\";";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(3, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("source1", statementAssignment.getTableAlias());
            Assert.assertEquals("SQL", statementAssignment.getQueryType());
            Assert.assertEquals("engine1", statementAssignment.getQueryEngine());
            Assert.assertEquals("select a,b,c from geofence where a>'0'", statementAssignment.getQueryText());

            statementAssignment = rootStatement.getStatementAssignments().get(1);
            Assert.assertEquals("t1", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select a, b, c from source1 where b = 123", statementAssignment.getQueryText());
        }
    }

    @Test
    public void test_parseRootStatement_variable_assignment_and_statement_assignment() throws IOException {
        {
            String query = "v1 = 'abc'; t1 = select a,b,c from source1; t2 = select ${v1} from source2; result = select a, c from t1 t1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query);
            Assert.assertEquals(3, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("t1", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select a,b,c from source1", statementAssignment.getQueryText());

            statementAssignment = rootStatement.getStatementAssignments().get(1);
            Assert.assertEquals("t2", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select abc from source2", statementAssignment.getQueryText());
        }
    }

    @Test
    public void test_parseRootStatement_with_variableOverwrite() throws IOException {
        {
            String query = "v1 = 'abc'; t1 = select a,b,c from source1; t2 = select ${v1} from source2; result = select a, c from t1 t1;";

            Map<String, Object> variableOverwrite = new HashMap<>();
            variableOverwrite.put("v1", "abc_overwrite");

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parseRootStatement(query, variableOverwrite);
            Assert.assertEquals(3, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("t1", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select a,b,c from source1", statementAssignment.getQueryText());

            statementAssignment = rootStatement.getStatementAssignments().get(1);
            Assert.assertEquals("t2", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select abc_overwrite from source2", statementAssignment.getQueryText());
        }
    }

    @Test
    public void test_parseRootStatement_with_variableOverwriteText() throws IOException {
        {
            String query = "v1 = 'abc'; t1 = select a,b,c from source1; t2 = select ${v1} from source2; result = select a, c from t1 t1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parse(query, "v1='abc_overwrite';").getRootStatement();
            Assert.assertEquals(3, rootStatement.getStatementAssignments().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("t1", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select a,b,c from source1", statementAssignment.getQueryText());

            statementAssignment = rootStatement.getStatementAssignments().get(1);
            Assert.assertEquals("t2", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select abc_overwrite from source2", statementAssignment.getQueryText());
        }
    }

    @Test
    public void test_parseRootStatement_with_action() throws IOException {
        {
            String query = "t1=select a,b,c from source1; result = select * from t1; do('v1', 'v2', t1);";

            Map<String, Object> variableOverwrite = new HashMap<>();
            variableOverwrite.put("v1", "abc_overwrite");

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parse(query, variableOverwrite).getRootStatement();
            Assert.assertEquals(2, rootStatement.getStatementAssignments().size());
            Assert.assertEquals(1, rootStatement.getActionStatements().size());

            StatementAssignment statementAssignment = rootStatement.getStatementAssignments().get(0);
            Assert.assertEquals("t1", statementAssignment.getTableAlias());
            Assert.assertEquals(null, statementAssignment.getQueryType());
            Assert.assertEquals(null, statementAssignment.getQueryEngine());
            Assert.assertEquals("select a,b,c from source1", statementAssignment.getQueryText());

            Assert.assertEquals("do", rootStatement.getActionStatements().get(0).getFunctionName());
            Assert.assertEquals(ValueType.String, rootStatement.getActionStatements().get(0).getParamValues().get(0).getValueType());
            Assert.assertEquals("v1", rootStatement.getActionStatements().get(0).getParamValues().get(0).getValue());
            Assert.assertEquals(ValueType.String, rootStatement.getActionStatements().get(0).getParamValues().get(1).getValueType());
            Assert.assertEquals("v2", rootStatement.getActionStatements().get(0).getParamValues().get(1).getValue());
            Assert.assertEquals(ValueType.Table, rootStatement.getActionStatements().get(0).getParamValues().get(2).getValueType());
            Assert.assertEquals("t1", rootStatement.getActionStatements().get(0).getParamValues().get(2).getValue());
        }
    }

    @Test
    public void test_parseRootStatement_comment() throws IOException {
        {
            String query = "t1=select a,b,c from source1; \n-- do('v1', 'v2', t1);";

            Map<String, Object> variableOverwrite = new HashMap<>();
            variableOverwrite.put("v1", "abc_overwrite");

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parse(query, variableOverwrite).getRootStatement();
            Assert.assertEquals(1, rootStatement.getStatementAssignments().size());
            Assert.assertEquals(0, rootStatement.getActionStatements().size());
        }
    }

    @Test
    public void test_parseRootStatement_jsonQuery() throws IOException {
        {
            String query = "t1 = json engine1 set url='http://server/api';{'query': '...'}; result = select * from t1;";

            QuerySqlParser parser = new QuerySqlParser();
            RootStatement rootStatement = parser.parse(query).getRootStatement();
            Assert.assertEquals(1, rootStatement.getStatementAssignments().size());
            Assert.assertEquals("result", rootStatement.getStatementAssignments().get(0).getTableAlias());
            Assert.assertEquals("select * from t1", rootStatement.getStatementAssignments().get(0).getQueryText());

            Assert.assertEquals(0, rootStatement.getActionStatements().size());
            Assert.assertEquals(1, rootStatement.getJsonQueryStatementAssignments().size());

            Assert.assertEquals("t1", rootStatement.getJsonQueryStatementAssignments().get(0).getTableAlias());
            Assert.assertEquals("engine1", rootStatement.getJsonQueryStatementAssignments().get(0).getQueryEngine());
            Assert.assertEquals(1, rootStatement.getJsonQueryStatementAssignments().get(0).getQueryConfig().size());
            Assert.assertEquals("http://server/api", rootStatement.getJsonQueryStatementAssignments().get(0).getQueryConfig().get("url"));
            Assert.assertEquals("{'query': '...'}", rootStatement.getJsonQueryStatementAssignments().get(0).getQueryStatement());
        }
    }
}
