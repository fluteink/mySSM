package com.fluteink.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class IOCByXMLTest {
    @Test
    public void testIOCByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
