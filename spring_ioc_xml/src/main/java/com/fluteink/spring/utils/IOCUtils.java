package com.fluteink.spring.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 明宇
 * @version 1.0
 */
public class IOCUtils {
public static ApplicationContext getIOC(String configLocation) {
    return new ClassPathXmlApplicationContext(configLocation);
}
}
