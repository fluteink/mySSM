package com.fluteink.spring.aop.annptation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 明宇
 * @version 1.0
 */
@Component
@Aspect
public class LoggerAspect {
    @Before("execution(public int com.fluteink.spring.aop.annptation.CalculatorImpl.add(int, int))")
    public void BeforeAdviceMethod() {
        System.out.println("LoggerAspect,前置通知");
    }

}
