package com.fluteink.proxy;

import com.fluteink.spring.proxy.Calculator;
import com.fluteink.spring.proxy.CalculatorImpl;
import com.fluteink.spring.proxy.CalculatorStaticProxy;
import com.fluteink.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author 明宇
 * @version 1.0
 */
public class test {
    @Test
    public void testproxy() {
//        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
//        proxy.add(1,2);

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator)proxyFactory.getProxy();
        proxy.div(1,1);
    }
}
