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

package com.uber.uscriptquery.util;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.IOException;

public class JsonFileCredentialProvider implements java.io.Serializable, CredentialProvider {
    private static final Logger logger = LoggerFactory.getLogger(JsonFileCredentialProvider.class);

    @Override
    public String getPassword(String passwordFile, String passwordEntry) {
        if (passwordFile == null || passwordFile.isEmpty()) {
            throw new RuntimeException("passwordFile is null or empty");
        }

        String passwordFileOriginalValue = passwordFile;
        passwordFile = com.uber.uscriptquery.util.FileUtils.getSymbolicLinkTargetFile(passwordFile);
        logger.info(String.format("Reading password file: %s (%s)", passwordFileOriginalValue, passwordFile));
        String password;
        final String fileContent;
        try (FileReader fileReader = new FileReader(passwordFile)) {
            fileContent = IOUtils.toString(fileReader);
        } catch (IOException e) {
            throw new RuntimeException(String.format("Failed to read password file %s on current machine %s", passwordFile, NetworkUtils.getLocalHostName()), e);
        }
        if (passwordEntry == null || passwordEntry.isEmpty()) {
            password = fileContent;
        } else {
            password = JsonPathUtils.getJsonPathAsString(fileContent, passwordEntry);
        }

        return password;
    }
}
