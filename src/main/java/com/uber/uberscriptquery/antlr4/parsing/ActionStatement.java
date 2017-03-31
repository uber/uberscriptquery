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

import java.util.ArrayList;
import java.util.List;

public class ActionStatement {
    private String functionName;
    private List<ActionParamValue> paramValues = new ArrayList<>();

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<ActionParamValue> getParamValues() {
        return paramValues;
    }

    public void setParamValues(List<ActionParamValue> paramValues) {
        this.paramValues = paramValues;
    }

    @Override
    public String toString() {
        return "ActionStatement{" +
                "functionName='" + functionName + '\'' +
                ", paramValues=" + paramValues +
                '}';
    }
}

