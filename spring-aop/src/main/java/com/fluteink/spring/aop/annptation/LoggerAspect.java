package com.fluteink.spring.aop.annptation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 明宇
 * @version 1.0
 */
@Component
@Aspect
public class LoggerAspect {
    @Pointcut("execution(* com.fluteink.spring.aop.annptation.CalculatorImpl.*(..))")
    public void pointCut() {}
//    @Before("execution(public int com.fluteink.spring.aop.annptation.CalculatorImpl.add(int, int))")
    @Before("pointCut()")
    public void BeforeAdviceMethod(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect,前置通知,方法"+signature.getName()+"参数"+ Arrays.toString(args));
    }
    @After("pointCut()")
    public void AfterAdviceMethod(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect,后置通知,方法"+signature.getName()+"参数"+ Arrays.toString(args));

    }

}
