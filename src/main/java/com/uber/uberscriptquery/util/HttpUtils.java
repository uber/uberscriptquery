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

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

public class HttpUtils {
    public static final int OK_CODE = 200;
    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    public static HttpResponse get(String url, Map<String, String> header) {
        int statusCode = 0;
        String responseBody = "";

        try {
            logger.info(String.format("Getting url: %s", url));
            try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
                HttpGet httpGet = new HttpGet(url);
                if (header != null && !header.isEmpty()) {
                    for (Map.Entry<String, String> entry : header.entrySet()) {
                        httpGet.addHeader(entry.getKey(), entry.getValue());
                    }
                }
                try (CloseableHttpResponse httpResponse = httpClient.execute(httpGet)) {
                    statusCode = httpResponse.getStatusLine().getStatusCode();
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()))) {
                        responseBody = IOUtils.toString(reader);
                        logger.info(String.format("Finished getting url: %s, Http status: %s, Response body: %s",
                                url, statusCode, truncateLogString(responseBody)));
                    }
                }
            }
            return new HttpResponse(statusCode, responseBody);
        } catch (Exception ex) {
            String msg = String.format("Failed getting url: %s", url);
            logger.warn(msg, ex);
            throw new RuntimeException(msg, ex);
        }
    }

    public static HttpResponse post(String url, Map<String, String> header, String body) {
        int statusCode = 0;
        String responseBody = "";

        try {
            logger.info(String.format("Getting url: %s", url));
            try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
                HttpPost httpPost = new HttpPost(url);
                if (header != null && !header.isEmpty()) {
                    for (Map.Entry<String, String> entry : header.entrySet()) {
                        httpPost.addHeader(entry.getKey(), entry.getValue());
                    }
                }
                httpPost.setEntity(new StringEntity(body));
                try (CloseableHttpResponse httpResponse = httpClient.execute(httpPost)) {
                    statusCode = httpResponse.getStatusLine().getStatusCode();
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()))) {
                        responseBody = IOUtils.toString(reader);
                        logger.info(String.format("Finished getting url: %s, Http status: %s, Response body: %s",
                                url, statusCode, truncateLogString(responseBody)));
                    }
                }
            }
            return new HttpResponse(statusCode, responseBody);
        } catch (Exception ex) {
            String msg = String.format("Failed getting url: %s", url);
            logger.warn(msg, ex);
            throw new RuntimeException(msg, ex);
        }
    }

    private static String truncateLogString(String str) {
        int maxSize = 1000;
        if (str == null || str.length() <= maxSize) {
            return str;
        }

        return str.substring(0, maxSize) + "...";
    }

    public static class HttpResponse {

        private int code;
        private String body;

        public HttpResponse(int code, String body) {
            super();
            this.code = code;
            this.body = body;
        }

        public int getCode() {
            return code;
        }

        public String getBody() {
            return body;
        }

        @Override
        public String toString() {
            return "HttpResponse [code=" + code + ", body=" + body + "]";
        }
    }
}
