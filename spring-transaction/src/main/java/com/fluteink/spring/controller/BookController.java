package com.fluteink.spring.controller;

import com.fluteink.spring.service.BookService;
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

    public void buyBook(Integer userId,Integer bookId) {
        bookService.buyBook(userId, bookId);
    }
}
