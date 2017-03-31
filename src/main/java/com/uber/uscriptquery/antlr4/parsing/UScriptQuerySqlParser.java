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

import com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlBaseListener;
import com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlLexer;
import org.antlr.v4.runtime.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class UScriptQuerySqlParser {
    private static final Logger logger = LoggerFactory.getLogger(UScriptQuerySqlParser.class);

    public RootStatement parseRootStatement(String text) {
        return parseRootStatement(text, null);
    }

    public RootStatement parseRootStatement(String text, Map<String, Object> variableOverwrite) {
        return parse(text, variableOverwrite).getRootStatement();
    }

    public UScriptQuerySqlParseResult parse(String text) {
        return parse(text, (Map<String, Object>) null);
    }

    public UScriptQuerySqlParseResult parse(String text, String variableOverwriteText) {
        Map<String, Object> variableOverwrite = new HashMap<>();

        if (variableOverwriteText != null && !variableOverwriteText.isEmpty()) {
            UScriptQueryTemplateParser templateMixTextParser = new UScriptQueryTemplateParser();
            UScriptQueryTemplateParseResult UScriptQueryTemplateParseResult = templateMixTextParser.parse(variableOverwriteText, null);

            for (Map.Entry<String, Object> entry : UScriptQueryTemplateParseResult.getVariableMap().entrySet()) {
                logger.info(String.format("Found variable in query overwrite: %s = %s", entry.getKey(), entry.getValue()));
            }

            if (UScriptQueryTemplateParseResult.getVariableMap() != null && !UScriptQueryTemplateParseResult.getVariableMap().isEmpty()) {
                variableOverwrite.putAll(UScriptQueryTemplateParseResult.getVariableMap());
            }
        }

        return parse(text, variableOverwrite);
    }

    public UScriptQuerySqlParseResult parse(String text, Map<String, Object> variableOverwrite) {
        UScriptQueryTemplateParser templateMixTextParser = new UScriptQueryTemplateParser();
        UScriptQueryTemplateParseResult UScriptQueryTemplateParseResult = templateMixTextParser.parse(text, variableOverwrite);

        for (Map.Entry<String, Object> entry : UScriptQueryTemplateParseResult.getVariableMap().entrySet()) {
            logger.info(String.format("Found variable: %s = %s", entry.getKey(), entry.getValue()));
        }

        String templateBody = UScriptQueryTemplateParseResult.getTemplateBody();
        logger.info("Found transformed template body: " + templateBody);

        logger.info("Parsing query after template transformaion: " + templateBody);

        final char[] charArray = templateBody.toCharArray();

        final char[] charArrayUpperCase = templateBody.toUpperCase().toCharArray();

        final RootStatement rootStatement = new RootStatement();

        UScriptQuerySqlLexer l = new UScriptQuerySqlLexer(new ANTLRInputStream(charArrayUpperCase, charArrayUpperCase.length));
        com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser p = new com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException(
                        String.format("Failed to parse at line %s char %s due to %s", line, charPositionInLine, msg),
                        e);
            }
        });

        p.addParseListener(
                new UScriptQuerySqlBaseListener() {
                    @Override
                    public void enterFileAssignment(com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.FileAssignmentContext ctx) {
                        FileAssignment fileAssignment = new FileAssignment();
                        rootStatement.getFileAssignments().add(fileAssignment);
                    }

                    @Override
                    public void exitFileAssignment(com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.FileAssignmentContext ctx) {
                        FileAssignment fileStatement = rootStatement.getFileAssignments().get(rootStatement.getFileAssignments().size() - 1);
                        String tableAlias = getMatchedString(ctx.fileAssignment_tableAlias(), charArray);
                        String fileType = getMatchedString(ctx.fileAssignment_fileType(), charArray);
                        String fileLocation = getMatchedString(ctx.fileAssignment_fileLocation(), charArray);
                        fileStatement.setTableAlias(tableAlias);
                        fileStatement.setFileType(fileType);
                        fileStatement.setFileLocation(fileLocation);
                    }

                    @Override
                    public void enterStatementAssignment(com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.StatementAssignmentContext ctx) {
                        StatementAssignment statementAssignment = new StatementAssignment();
                        rootStatement.getStatementAssignments().add(statementAssignment);
                    }

                    @Override
                    public void exitStatementAssignment(com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.StatementAssignmentContext ctx) {
                        StatementAssignment inputStatement = rootStatement.getStatementAssignments().get(rootStatement.getStatementAssignments().size() - 1);
                        String tableAlias = getMatchedString(ctx.statementAssignment_tableAlias(), charArray);
                        String queryType = getMatchedString(ctx.statementAssignment_queryType(), charArray);
                        String queryEngine = getMatchedString(ctx.statementAssignment_queryEngine(), charArray);
                        String queryText = getMatchedString(ctx.statementAssignment_query(), charArray);

                        inputStatement.setTableAlias(tableAlias);
                        inputStatement.setQueryType(queryType);
                        inputStatement.setQueryEngine(queryEngine);
                        inputStatement.setQueryText(queryText);

                        if (ctx.statementAssignment_query().configSetting() != null) {
                            for (com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.ConfigSettingContext configSettingContext : ctx.statementAssignment_query().configSetting()) {
                                String settingName = getMatchedString(configSettingContext.qualifiedName(), charArray);
                                String settingValue = getMatchedString(configSettingContext.constant(), charArray);
                                settingValue = ParserUtils.getStringStatementInnerValue(settingValue);
                                inputStatement.getQueryConfig().put(settingName, settingValue);
                            }
                        }

                        inputStatement.setQueryStatement(getMatchedString(ctx.statementAssignment_query().statement(), charArray));
                    }

                    @Override
                    public void exitTableIdentifier(com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.TableIdentifierContext ctx) {
                        String str = getMatchedString(ctx.table, charArray);
                        rootStatement.getTableReferenceCount().increase(str);
                    }
                });

        com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.RootContext rootContext = p.root();

        if (rootContext.jsonQueryStatementAssignment() != null) {
            for (com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.JsonQueryStatementAssignmentContext jsonQueryStatementAssignmentContext : rootContext.jsonQueryStatementAssignment()) {
                StatementAssignment jsonQueryStatementAssignment = new StatementAssignment();

                String tableAlias = getMatchedString(jsonQueryStatementAssignmentContext.statementAssignment_tableAlias(), charArray);
                String queryType = "JSON";
                String queryEngine = getMatchedString(jsonQueryStatementAssignmentContext.statementAssignment_queryEngine(), charArray);
                String queryText = getMatchedString(jsonQueryStatementAssignmentContext.jsonQueryStatementAssignment_query(), charArray);
                String queryStatement = getMatchedString(jsonQueryStatementAssignmentContext.jsonQueryStatementAssignment_query().jsonObject(), charArray);

                jsonQueryStatementAssignment.setTableAlias(tableAlias);
                jsonQueryStatementAssignment.setQueryType(queryType);
                jsonQueryStatementAssignment.setQueryEngine(queryEngine);
                jsonQueryStatementAssignment.setQueryText(queryText);
                jsonQueryStatementAssignment.setQueryStatement(queryStatement);

                if (jsonQueryStatementAssignmentContext.jsonQueryStatementAssignment_query().configSetting() != null) {
                    for (com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.ConfigSettingContext configSettingContext : jsonQueryStatementAssignmentContext.jsonQueryStatementAssignment_query().configSetting()) {
                        String settingName = getMatchedString(configSettingContext.qualifiedName(), charArray);
                        String settingValue = getMatchedString(configSettingContext.constant(), charArray);
                        settingValue = ParserUtils.getStringStatementInnerValue(settingValue);
                        jsonQueryStatementAssignment.getQueryConfig().put(settingName, settingValue);
                    }
                }

                rootStatement.getJsonQueryStatementAssignments().add(jsonQueryStatementAssignment);
            }
        }

        if (rootContext.actionStatement() != null) {
            for (com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.ActionStatementContext actionStatementContext : rootContext.actionStatement()) {
                String name = getMatchedString(actionStatementContext.qualifiedName(), charArray);

                ActionStatement actionStatement = new ActionStatement();
                actionStatement.setFunctionName(name);

                if (actionStatementContext.actionStatement_param() != null) {
                    for (com.uber.uscriptquery.antlr4.generated.UScriptQuerySqlParser.ActionStatement_paramContext paramContext : actionStatementContext.actionStatement_param()) {
                        if (paramContext.STRING() != null) {
                            ValueType valueType = ValueType.String;
                            String value = getMatchedString(paramContext.STRING().getSymbol(), charArray);
                            value = ParserUtils.getStringStatementInnerValue(value);
                            actionStatement.getParamValues().add(new ActionParamValue(valueType, value));
                        } else if (paramContext.IDENTIFIER() != null) {
                            ValueType valueType = ValueType.Table;
                            String value = getMatchedString(paramContext.IDENTIFIER().getSymbol(), charArray);
                            actionStatement.getParamValues().add(new ActionParamValue(valueType, value));

                            rootStatement.getTableReferenceCount().increase(value);
                        }
                    }
                }

                rootStatement.getActionStatements().add(actionStatement);
            }
        }

        UScriptQuerySqlParseResult result = new UScriptQuerySqlParseResult();
        result.setRootStatement(rootStatement);

        return result;
    }

    private String getMatchedString(ParserRuleContext ctx, char[] charArray) {
        if (ctx == null || ctx.getStart() == null) {
            return null;
        }

        int startIndex = ctx.getStart().getStartIndex();
        int endIndex = ctx.getStop().getStopIndex();

        if (endIndex < startIndex) {
            return "";
        }

        return new String(charArray, startIndex, endIndex + 1 - startIndex);
    }

    private String getMatchedString(Token ctx, char[] charArray) {
        if (ctx == null) {
            return null;
        }

        int startIndex = ctx.getStartIndex();
        int endIndex = ctx.getStopIndex();

        if (endIndex < startIndex) {
            return "";
        }

        return new String(charArray, startIndex, endIndex + 1 - startIndex);
    }
}
