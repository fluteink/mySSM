package com.fluteink.spring.service;

/**
 * @author 明宇
 * @version 1.0
 */
public interface CheckoutService {
    void checkout(Integer userId, Integer[] bookIds);
}
