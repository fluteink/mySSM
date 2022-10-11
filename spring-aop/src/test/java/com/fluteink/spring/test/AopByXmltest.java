package com.fluteink.spring.test;

import com.fluteink.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class AopByXmltest {
    @Test
    public void testAopByxml() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator c = ioc.getBean(Calculator.class);
//        c.div(1, 1);
        c.add(1, 5);
//        c.mul(1, 5);
//        c.sub(1, 5);

    }

}
