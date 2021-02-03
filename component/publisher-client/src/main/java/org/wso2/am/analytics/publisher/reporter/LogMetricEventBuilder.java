/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.am.analytics.publisher.reporter;

import org.wso2.am.analytics.publisher.exception.MetricReportingException;

import java.util.HashMap;
import java.util.Map;

public class LogMetricEventBuilder extends AbstractMetricEventBuilder {
    private Map<String, Object> eventMap = new HashMap<>();

    public LogMetricEventBuilder addProperty(String key, Object value) {
        eventMap.put(key, value);
        return this;
    }

    @Override
    protected Map<String, Object> buildEvent() {
        return eventMap;
    }

    @Override protected MetricEventBuilder addVerifiedAttribute(String key, Object value) {
        eventMap.put(key, value);
        return this;
    }

    @Override
    protected boolean isKeyPresent(String key) {
        return true;
    }

    @Override
    public boolean validate() throws MetricReportingException {
        return true;
    }
}
