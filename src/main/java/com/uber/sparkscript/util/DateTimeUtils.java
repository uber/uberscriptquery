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

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeUtils {

    public static long getMillisSmart(double value) {
        Date dt = new Date((long) value);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.setTime(dt);
        int year = cal.get(Calendar.YEAR);
        if (year >= 2000 && year < 3000) {
            return (long) value;
        }
        return (long) (value * 1000);
    }

    public static long getMillisSmart(long value) {
        Date dt = new Date(value);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.setTime(dt);
        int year = cal.get(Calendar.YEAR);
        if (year >= 2000 && year < 3000) {
            return value;
        }
        return value * 1000;
    }

}
