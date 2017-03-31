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

import junit.framework.Assert;
import org.junit.Test;

public class UberScriptQueryTemplateParserTest {

    @Test
    public void test_parse() {
        {
            String query = "v1 = 'abc'; v2 = \"def\";";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(2, root.getVariableMap().size());
            Assert.assertEquals("abc", root.getVariableMap().get("v1"));
            Assert.assertEquals("def", root.getVariableMap().get("v2"));
            Assert.assertEquals("", root.getTemplateBody());
        }
        {
            String query = "v1 = 'abc'; v2 = \"def\"; body";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(2, root.getVariableMap().size());
            Assert.assertEquals("abc", root.getVariableMap().get("v1"));
            Assert.assertEquals("def", root.getVariableMap().get("v2"));
            Assert.assertEquals(" body", root.getTemplateBody());
        }
        {
            String query = "v1 = 'abc'; v2 = \"def\"; ~!@# $%^&*()_+ '\" = == abc='def' v=\"ttt\"";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(2, root.getVariableMap().size());
            Assert.assertEquals("abc", root.getVariableMap().get("v1"));
            Assert.assertEquals("def", root.getVariableMap().get("v2"));
            Assert.assertEquals(" ~!@# $%^&*()_+ '\" = == abc='def' v=\"ttt\"", root.getTemplateBody());
        }

        {
            String query = "v1 = abc; v2 = \"def\"; ~!@# $%^&*()_+ '\" = == abc='def' v=\"ttt\"";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(0, root.getVariableMap().size());
            Assert.assertEquals("v1 = abc; v2 = \"def\"; ~!@# $%^&*()_+ '\" = == abc='def' v=\"ttt\"", root.getTemplateBody());
        }
    }

    @Test
    public void test_parse_table_assignement() {
        {
            String query = "v1 = select a,b, c from table1; v2 = select c, d,e from table2;";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(0, root.getVariableMap().size());
            Assert.assertEquals("v1 = select a,b, c from table1; v2 = select c, d,e from table2;", root.getTemplateBody());
        }
        {
            String query = "v1 = select a,b, c from table1; v2 = select c, d,e from table2; select a,b,d,e from v1 v1 join (select * from v2 v2) on v1.c = v2.c";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(0, root.getVariableMap().size());
            Assert.assertEquals("v1 = select a,b, c from table1; v2 = select c, d,e from table2; select a,b,d,e from v1 v1 join (select * from v2 v2) on v1.c = v2.c", root.getTemplateBody());
        }
    }

    @Test
    public void test_parse_reference_variable_inside_variable() {
        {
            String query = "v1 = 'abc'; v2 = \"d${v1}f\"; body";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(2, root.getVariableMap().size());
            Assert.assertEquals("abc", root.getVariableMap().get("v1"));
            Assert.assertEquals("dabcf", root.getVariableMap().get("v2"));
            Assert.assertEquals(" body", root.getTemplateBody());
        }
        {
            String query = "v1 = 'abc'; v2 = \"d${v1}f\"; v3 = '1${v2}2'; body -- ${v1}, ${v2}, ${v3} --";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(3, root.getVariableMap().size());
            Assert.assertEquals("abc", root.getVariableMap().get("v1"));
            Assert.assertEquals("dabcf", root.getVariableMap().get("v2"));
            Assert.assertEquals("1dabcf2", root.getVariableMap().get("v3"));
            Assert.assertEquals(" body -- abc, dabcf, 1dabcf2 --", root.getTemplateBody());
        }
    }

    @Test
    public void test_parse_special_characters() {
        {
            String query = "v1 = '\"abc\"';body";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(1, root.getVariableMap().size());
            Assert.assertEquals("\"abc\"", root.getVariableMap().get("v1"));
            Assert.assertEquals("body", root.getTemplateBody());
        }
        {
            String query = "v1 = \"'abc'\";body";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(1, root.getVariableMap().size());
            Assert.assertEquals("'abc'", root.getVariableMap().get("v1"));
            Assert.assertEquals("body", root.getTemplateBody());
        }
        {
            String query = "v1 = '\\'abc\\'';body";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(1, root.getVariableMap().size());
            Assert.assertEquals("'abc'", root.getVariableMap().get("v1"));
            Assert.assertEquals("body", root.getTemplateBody());
        }
        {
            String query = "v1 = \"\\\"abc\\\"\";body";

            UberScriptQueryTemplateParser parser = new UberScriptQueryTemplateParser();
            UberScriptQueryTemplateParseResult root = parser.parse(query);
            Assert.assertEquals(1, root.getVariableMap().size());
            Assert.assertEquals("\"abc\"", root.getVariableMap().get("v1"));
            Assert.assertEquals("body", root.getTemplateBody());
        }
    }
}
