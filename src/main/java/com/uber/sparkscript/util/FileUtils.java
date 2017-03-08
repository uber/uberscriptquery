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

package com.uber.sparkscript.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public static String getSymbolicLinkTargetFile(String path) {
        Path result = getSymbolicLinkTargetFile(Paths.get(path));
        return result.toString();
    }

    public static Path getSymbolicLinkTargetFile(Path path) {
        if (!Files.isSymbolicLink(path)) {
            return path;
        }

        try {
            Path targetPath = Files.readSymbolicLink(path);
            return getSymbolicLinkTargetFile(targetPath);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read symbolic link: " + path, e);
        }
    }

}
