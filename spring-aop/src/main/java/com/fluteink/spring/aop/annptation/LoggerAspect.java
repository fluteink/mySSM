package com.fluteink.spring.aop.annptation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
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
        System.out.println("LoggerAspect,后置通知,方法"+signature.getName()+"执行完毕");
    }
    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,返回通知,"+signature.getName()+"结果"+result);
    }

    @AfterThrowing(value = "pointCut()" ,throwing = "ex")
    public void afterThrowingAdviceMethod(JoinPoint joinPoint,Exception ex) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,方法："+ signature.getName()+",异常通知."+"异常:"+ex);
    }

}
