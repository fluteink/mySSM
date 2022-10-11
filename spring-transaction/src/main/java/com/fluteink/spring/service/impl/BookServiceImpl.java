package com.fluteink.spring.service.impl;

import com.fluteink.spring.dao.BookDao;
import com.fluteink.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 明宇
 * @version 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
//    @Transactional(
////            timeout = 3,
////            noRollbackFor = ArithmeticException.class
////            noRollbackForClassName = "java.lang.ArithmeticException"
////            isolation = Isolation.DEFAULT
////            propagation = Propagation.REQUIRES_NEW
//    )
    public void buyBook(Integer userId, Integer bookId) {
/*
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
        Integer price = bookDao.getPriceByBookId(bookId);
        bookDao.updateStock(bookId);
        bookDao.updateBalance(userId, price);
//        System.out.println(1/0);
    }
}
