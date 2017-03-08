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


import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JsonUtils {
  protected static ObjectMapper mapper = new ObjectMapper();

  static {
    mapper.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
    mapper.configure(Feature.ALLOW_SINGLE_QUOTES, true);
    mapper.configure(Feature.ALLOW_COMMENTS, true);
  }

  public static String serialize(Object obj) {
    if(obj == null) {
      return "";
    } else {
      try {
        return mapper.writeValueAsString(obj);
      } catch (JsonProcessingException ex) {
        throw new RuntimeException(String.format("Failed to serialize %s (%s)", obj, obj.getClass()), ex);
      }
    }
  }

  public static <T> T deserialize(String content, Class<T> valueType) {
    try {
      return mapper.readValue(content, valueType);
    } catch (IOException ex) {
      throw new RuntimeException(String.format("Failed to deserialize %s from json %s", valueType, content), ex);
    }
  }

  public static <T> List<T> deserializeList(String content, Class<T> valueType) {
    try {
      return mapper.readValue(content, new TypeReference<List<T>>(){});
    } catch (IOException ex) {
      throw new RuntimeException(String.format("Failed to deserialize %s from json %s", valueType, content), ex);
    }
  }
}