package com.fluteink.spring.test;

import com.fluteink.spring.controller.UserController;
import com.fluteink.spring.dao.UserDao;
import com.fluteink.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class IOCByAnnotationTest {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController bean = ioc.getBean("yyy", UserController.class);
/*
        System.out.println(bean);
        UserService bean1 = ioc.getBean(UserService.class);
        System.out.println(bean1);
        UserDao bean2 = ioc.getBean(UserDao.class);
        System.out.println(bean2);
*/
        bean.saveUser();
    }
}
