package com.uber.sparkscript.util;


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

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class ResourceUtils {
  public static String readResource(Class clazz, String resourceName) {
    try (InputStream in = clazz.getResourceAsStream(resourceName)) {
      return IOUtils.toString(in);
    } catch (Throwable ex) {
      throw new RuntimeException(ex);
    }
  }

  public static String readResource(String resourceName) {
    try (InputStream in = ResourceUtils.class.getClassLoader().getResourceAsStream(resourceName)) {
      return IOUtils.toString(in);
    } catch (Throwable ex) {
      throw new RuntimeException(ex);
    }
  }

  public static List<String> readLinesFromResource(Class clazz, String resourceName) {
    String text = readResource(clazz, resourceName);
    return Arrays.asList(text.split("\n"));
  }

}