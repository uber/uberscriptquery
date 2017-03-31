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

package com.uber.uberscriptquery.util;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TemplateUtils {
    public static String transform(String text, Map<String, Object> map) {
        List<String> supportedVariables = new ArrayList<>();
        for (String entry : map.keySet()) {
            supportedVariables.add(String.format("${%s}", entry));
        }

        String supportedVariablesStr = StringUtils.join(supportedVariables, ", ");

        final String templateName = "query";
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_24);
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        StringTemplateLoader ctl = new StringTemplateLoader();
        ctl.putTemplate(templateName, text);
        cfg.setTemplateLoader(ctl);

        Template template;
        try {
            template = cfg.getTemplate(templateName);
        } catch (IOException e) {
            throw new RuntimeException("Failed to get template: " + templateName, e);
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream));

        try {
            template.process(map, writer);
        } catch (TemplateException | IOException e) {
            throw new RuntimeException(String.format("Failed to process text template: %s. Supported variables: %s", text, supportedVariablesStr), e);
        }

        try {
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(String.format("Failed to flush writer for text template: %s. Supported variables: %s", text, supportedVariablesStr), e);
        }

        byte[] bytes = byteArrayOutputStream.toByteArray();
        String result = new String(bytes, StandardCharsets.UTF_8);
        return result;
    }
}
