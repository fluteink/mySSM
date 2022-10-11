package com.fluteink.spring.dao;

/**
 * @author 明宇
 * @version 1.0
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);
}
