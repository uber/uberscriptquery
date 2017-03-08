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

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class JsonPathUtils {

	public static String getJsonPathAsString(String json, String path) {
		Configuration conf = Configuration.defaultConfiguration().addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL).addOptions(Option.SUPPRESS_EXCEPTIONS);
		Object document = conf.jsonProvider().parse(json);
		Object jsonObj = JsonPath.read(document, path);
		return convertJsonPathValueToString(jsonObj);
	}

	private static String convertJsonPathValueToString(Object jsonPathValue) {
		if (jsonPathValue == null) {
			return null;
		}

		if (jsonPathValue instanceof String) {
			return (String)jsonPathValue;
		}

		return JsonUtils.serialize(jsonPathValue);
	}
}
