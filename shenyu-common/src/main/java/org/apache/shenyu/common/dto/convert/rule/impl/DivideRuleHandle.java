/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.common.dto.convert.rule.impl;

import org.apache.shenyu.common.constant.Constants;
import org.apache.shenyu.common.constant.RuleHandleConstants;
import org.apache.shenyu.common.dto.convert.rule.RuleHandle;
import org.apache.shenyu.common.enums.LoadBalanceEnum;

import java.util.Objects;

/**
 * The type Divide rule handle.
 */
public class DivideRuleHandle implements RuleHandle {

    private static final long serialVersionUID = 3975134663460754084L;

    /**
     * loadBalance.
     * {@linkplain LoadBalanceEnum}
     */
    private String loadBalance;

    /**
     * http retry.
     */
    private int retry;

    /**
     * timeout is required.
     */
    private long timeout = Constants.TIME_OUT;

    /**
     * headerMaxSize.
     */
    private long headerMaxSize = Constants.HEADER_MAX_SIZE;

    /**
     * requestMaxSize.
     */
    private long requestMaxSize = Constants.REQUEST_MAX_SIZE;

    /**
     * get loadBalance.
     *
     * @return loadBalance
     */
    public String getLoadBalance() {
        return loadBalance;
    }

    /**
     * set loadBalance.
     *
     * @param loadBalance loadBalance
     */
    public void setLoadBalance(final String loadBalance) {
        this.loadBalance = loadBalance;
    }

    /**
     * get retry.
     *
     * @return retry
     */
    public int getRetry() {
        return retry;
    }

    /**
     * set retry.
     *
     * @param retry retry
     */
    public void setRetry(final int retry) {
        this.retry = retry;
    }

    /**
     * get timeout.
     *
     * @return timeout
     */
    public long getTimeout() {
        return timeout;
    }

    /**
     * set timeout.
     *
     * @param timeout timeout
     */
    public void setTimeout(final long timeout) {
        this.timeout = timeout;
    }

    /**
     * get headerMaxSize.
     *
     * @return headerMaxSize
     */
    public long getHeaderMaxSize() {
        return headerMaxSize;
    }

    /**
     * set headerMaxSize.
     *
     * @param headerMaxSize headerMaxSize
     */
    public void setHeaderMaxSize(final long headerMaxSize) {
        this.headerMaxSize = headerMaxSize;
    }

    /**
     * get requestMaxSize.
     *
     * @return requestMaxSize
     */
    public long getRequestMaxSize() {
        return requestMaxSize;
    }

    /**
     * set requestMaxSize.
     *
     * @param requestMaxSize requestMaxSize
     */
    public void setRequestMaxSize(final long requestMaxSize) {
        this.requestMaxSize = requestMaxSize;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DivideRuleHandle that = (DivideRuleHandle) o;
        return retry == that.retry && timeout == that.timeout && headerMaxSize == that.headerMaxSize
                && requestMaxSize == that.requestMaxSize && Objects.equals(loadBalance, that.loadBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadBalance, retry, timeout, headerMaxSize, requestMaxSize);
    }

    @Override
    public String toString() {
        return "DivideRuleHandle{"
                + "loadBalance='"
                + loadBalance
                + '\''
                + ", retry="
                + retry
                + ", timeout="
                + timeout
                + ", headerMaxSize="
                + headerMaxSize
                + ", requestMaxSize="
                + requestMaxSize
                + '}';
    }

    @Override
    public RuleHandle createDefault(final String path, final String rpcExt) {
        this.loadBalance = RuleHandleConstants.DEFAULT_LOAD_BALANCE.getName();
        this.retry = RuleHandleConstants.DEFAULT_RETRY;
        return this;
    }
}
