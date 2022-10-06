package com.fluteink.spring.test;

import com.fluteink.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class FactoryBeanTest {
    @Test
    public void FactoryBeanTest() {
        ApplicationContext ioc=  new ClassPathXmlApplicationContext("spring-factory.xml");
        User bean = ioc.getBean(User.class);
        System.out.println(bean);

    }
}
