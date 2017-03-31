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

import junit.framework.Assert;
import org.junit.Test;

public class SqlUtilsTest {
    @Test
    public void test_isTableNotExistExceptionMessage() {
        Assert.assertEquals(true, SqlUtils.isTableNotExistExceptionMessage("Table 'dataquerier.airport_eta_ata_summary' doesn't exist", "airport_eta_ata_summary"));
        Assert.assertEquals(true, SqlUtils.isTableNotExistExceptionMessage("Table airport_eta_ata_summary doesn't exist", "airport_eta_ata_summary"));

        Assert.assertEquals(true, SqlUtils.isTableNotExistExceptionMessage("Table 'dataquerier.airport_eta_ata_summary' not exist", "airport_eta_ata_summary"));
        Assert.assertEquals(true, SqlUtils.isTableNotExistExceptionMessage("Table airport_eta_ata_summary not exist", "airport_eta_ata_summary"));

        Assert.assertEquals(false, SqlUtils.isTableNotExistExceptionMessage("Table 'dataquerier.airport_eta_ata_summary' exist", "airport_eta_ata_summary"));
        Assert.assertEquals(false, SqlUtils.isTableNotExistExceptionMessage("Table 'dataquerier.abc' doesn't exist", "airport_eta_ata_summary"));
    }
}
