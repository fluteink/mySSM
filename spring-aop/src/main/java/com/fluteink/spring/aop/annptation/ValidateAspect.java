package com.fluteink.spring.aop.annptation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 明宇
 * @version 1.0
 */
@Component
@Aspect
@Order(0)
public class ValidateAspect {

    @Pointcut("execution(* com.fluteink.spring.aop.annptation.CalculatorImpl.*(..))")
    public void pointCut() {}
    @Before("pointCut()")
    public void beforeMethod() {
        System.out.println("ValidateAspect--》前置通知");
    }
}
