package com.fluteink.spring.test;

import com.fluteink.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class HelloWorldTest {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hello = (HelloWorld) ioc.getBean("hello-world");
        hello.sayHello();
    }
}
