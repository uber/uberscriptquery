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

package com.uber.sparkscript.antlr4.parsing;

import com.uber.sparkscript.antlr4.generated.SparkScriptTemplateBaseListener;
import com.uber.sparkscript.antlr4.generated.SparkScriptTemplateLexer;
import com.uber.sparkscript.util.TemplateUtils;
import org.antlr.v4.runtime.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SparkScriptTemplateParser {
    private static final Logger logger = LoggerFactory.getLogger(SparkScriptTemplateParser.class);

    public SparkScriptTemplateParseResult parse(String text) {
        return parse(text, null);
    }

    public SparkScriptTemplateParseResult parse(String text, Map<String, Object> variableOverwrite) {
        final char[] charArray = text.toCharArray();

        final char[] charArrayUpperCase = text.toUpperCase().toCharArray();

        final SparkScriptTemplateParseResult parsedResult = new SparkScriptTemplateParseResult();

        SparkScriptTemplateLexer l = new SparkScriptTemplateLexer(new ANTLRInputStream(charArrayUpperCase, charArrayUpperCase.length));
        com.uber.sparkscript.antlr4.generated.SparkScriptTemplateParser p = new com.uber.sparkscript.antlr4.generated.SparkScriptTemplateParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException(
                        String.format("Failed to parse at line %s char %s due to %s", line, charPositionInLine, msg),
                        e);
            }
        });

        final AtomicInteger lastOffset = new AtomicInteger(-1);

        final Map<String, Object> variableMap = new HashMap<>();

        if (variableOverwrite != null && !variableOverwrite.isEmpty()) {
            variableMap.putAll(variableOverwrite);
        }

        p.addParseListener(
                new SparkScriptTemplateBaseListener() {
                    @Override
                    public void exitVariableAssignment(com.uber.sparkscript.antlr4.generated.SparkScriptTemplateParser.VariableAssignmentContext ctx) {
                        lastOffset.set(ctx.getStop().getStopIndex());

                        String variableName = getMatchedString(ctx.variableAssignment_variableName(), charArray);

                        if (variableOverwrite != null && variableOverwrite.containsKey(variableName)) {
                            logger.info(String.format("Ignored variable %s because of variable overwrite with value %s", variableName, variableOverwrite.get(variableName)));
                            return;
                        }

                        String variableValue = getMatchedString(ctx.STRING().getSymbol(), charArray);

                        if (variableValue == null) {
                            return;
                        }
                        variableValue = ParserUtils.getStringStatementInnerValue(variableValue);

                        variableValue = TemplateUtils.transform(variableValue, variableMap);

                        variableMap.put(variableName, variableValue);
                    }

                    @Override
                    public void exitAssignmentWithSemicolon(com.uber.sparkscript.antlr4.generated.SparkScriptTemplateParser.AssignmentWithSemicolonContext ctx) {
                        lastOffset.set(ctx.getStop().getStopIndex());
                    }
                });

        p.root();

        parsedResult.setVariableMap(variableMap);

        String templateBody = new String(charArray, lastOffset.get() + 1, charArray.length - lastOffset.get() - 1);
        templateBody = TemplateUtils.transform(templateBody, variableMap);
        parsedResult.setTemplateBody(templateBody);

        return parsedResult;
    }

    private String getMatchedString(ParserRuleContext ctx, char[] charArray) {
        if (ctx == null || ctx.getStart() == null) {
            return null;
        }

        int startIndex = ctx.getStart().getStartIndex();
        int endIndex = ctx.getStop().getStopIndex();
        return new String(charArray, startIndex, endIndex + 1 - startIndex);
    }

    private String getMatchedString(org.antlr.v4.runtime.Token ctx, char[] charArray) {
        if (ctx == null) {
            return null;
        }

        int startIndex = ctx.getStartIndex();
        int endIndex = ctx.getStopIndex();
        return new String(charArray, startIndex, endIndex + 1 - startIndex);
    }
}
