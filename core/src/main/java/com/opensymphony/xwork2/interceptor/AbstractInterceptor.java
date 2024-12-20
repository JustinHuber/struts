/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.opensymphony.xwork2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;

/**
 * @deprecated since 6.7.0, use {@link org.apache.struts2.interceptor.AbstractInterceptor} instead.
 */
@Deprecated
public abstract class AbstractInterceptor extends org.apache.struts2.interceptor.AbstractInterceptor implements ConditionalInterceptor {

    /**
     * Override to handle interception
     */
    public abstract String intercept(ActionInvocation invocation) throws Exception;

    @Override
    public String intercept(org.apache.struts2.ActionInvocation invocation) throws Exception {
        return intercept(ActionInvocation.adapt(invocation));
    }

    @Override
    public boolean shouldIntercept(ActionInvocation invocation) {
        return super.shouldIntercept(invocation);
    }

    @Override
    public boolean shouldIntercept(org.apache.struts2.ActionInvocation invocation) {
        return shouldIntercept(ActionInvocation.adapt(invocation));
    }
}
