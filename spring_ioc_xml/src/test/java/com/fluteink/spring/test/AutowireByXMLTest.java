package com.fluteink.spring.test;

import com.fluteink.spring.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class AutowireByXMLTest {
    @Test
    public void testAutowireByXML() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController uc = ioc.getBean(UserController.class);
        uc.saveUser();
    }
}
