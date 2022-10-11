package com.fluteink.spring.controller;

import com.fluteink.spring.service.BookService;
import com.fluteink.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId, Integer bookId) {
        bookService.buyBook(userId, bookId);
    }

    public void checkout(Integer userId, Integer[] bookIds) {
        checkoutService.checkout(userId, bookIds);
    }
}
