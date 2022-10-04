package com.fluteink.spring.test;

import com.fluteink.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class LifeCycleTest {
    @Test
    public void test() {
        ConfigurableApplicationContext ioc= new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User bean = ioc.getBean(User.class);
        System.out.println(bean);
        ioc.close();
    }
}
