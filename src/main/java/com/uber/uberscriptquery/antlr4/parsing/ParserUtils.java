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

public class ParserUtils {
    public static String getStringStatementInnerValue(String variableValue) {
        // remove quote from value, and handle character escape
        // TODO handle more character escapes rather than \' and \"
        if (variableValue.startsWith("'")) {
            variableValue = variableValue.substring(1, variableValue.length() - 1);
            variableValue = variableValue.replace("\\'", "'");
        } else if (variableValue.startsWith("\"")) {
            variableValue = variableValue.substring(1, variableValue.length() - 1);
            variableValue = variableValue.replace("\\\"", "\"");
        }
        return variableValue;
    }
}
