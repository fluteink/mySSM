package com.fluteink.spring.test;

import com.fluteink.spring.aop.annptation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class AopTest {

    @Test
    public void testAopByAnnotation()  {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator c = ioc.getBean(Calculator.class);
        c.add(1,1);

    }


}
