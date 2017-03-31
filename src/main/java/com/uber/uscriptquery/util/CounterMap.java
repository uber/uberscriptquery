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

import java.util.HashMap;
import java.util.Map;

public class CounterMap implements java.io.Serializable {
    private Map<String, Long> map = new HashMap<>();

    public synchronized void increase(String name) {
        Long oldValue = map.get(name);
        if (oldValue == null) {
            map.put(name, 1L);
        } else {
            map.put(name, oldValue + 1);
        }
    }

    public synchronized long getCount(String name) {
        Long oldValue = map.get(name);
        if (oldValue == null) {
            return 0L;
        } else {
            return oldValue;
        }
    }
}
