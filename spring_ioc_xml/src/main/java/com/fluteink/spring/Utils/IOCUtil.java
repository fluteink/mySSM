package com.fluteink.spring.Utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class IOCUtil {
    public static ApplicationContext getIOC(){
        return new ClassPathXmlApplicationContext("applicationContext.xml");
    }

}
