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

import com.google.common.util.concurrent.Uninterruptibles;
import org.apache.log4j.Logger;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ExponentialBackoffRetryPolicy<T> implements RetryPolicy<T>, java.io.Serializable {
    private static final Logger LOG = Logger.getLogger(ExponentialBackoffRetryPolicy.class);

    private final int maximumAttemptCount;
    private final long minimumMilliseconds;
    private final float retryScaleFactor;

    public ExponentialBackoffRetryPolicy(int maximumAttemptCount, long minimumMilliseconds) {
        this(maximumAttemptCount, minimumMilliseconds, 2.0f);
    }

    public ExponentialBackoffRetryPolicy(int maximumAttemptCount, long minimumMilliseconds, float retryScaleFactor) {
        this.maximumAttemptCount = maximumAttemptCount;
        this.minimumMilliseconds = minimumMilliseconds;
        this.retryScaleFactor = retryScaleFactor;
    }

    @Override
    public T attempt(Callable<T> callable) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int remainingAttempts = maximumAttemptCount - 1;
        long minimumSleepTime = minimumMilliseconds;
        long maximumSleepTime = (long) (minimumSleepTime * retryScaleFactor);

        Throwable previousException;

        try {
            return callable.call();
        } catch (Throwable ex) {
            if (remainingAttempts <= 0) {
                throw new RuntimeException("Failed on first try and there is no remaining retry", ex);
            }
            previousException = ex;
        }

        while (remainingAttempts > 0) {
            long sleepTime = random.nextLong(minimumSleepTime, maximumSleepTime);
            LOG.info(String.format("Sleeping %s milliseconds and retrying on exception: %s", sleepTime, previousException));
            Uninterruptibles.sleepUninterruptibly(sleepTime, TimeUnit.MILLISECONDS);
            try {
                return callable.call();
            } catch (Throwable ex) {
                previousException = ex;
            }
            remainingAttempts--;
            minimumSleepTime *= retryScaleFactor;
            maximumSleepTime *= retryScaleFactor;
        }

        String msg = String.format("Failed after tried %s times", maximumAttemptCount);
        throw new RuntimeException(msg, previousException);
    }

}
