package com.axr.ghosts;

import java.net.UnknownHostException;

/**
 * 重试函数接口
 * @author xinrui.an
 * @date 2025/03/21
 */
@FunctionalInterface
public interface RetryFunction<T> {
    T execute() throws IllegalStateException, UnknownHostException;
}