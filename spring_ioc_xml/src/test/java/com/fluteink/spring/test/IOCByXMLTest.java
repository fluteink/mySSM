package com.fluteink.spring.test;

import com.fluteink.spring.Utils.IOCUtil;
import com.fluteink.spring.pojo.Student;
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
        Student stu = (Student) ioc.getBean("studentOne");
        System.out.println(stu);
    }
    @Test
    public void testDI() {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ioc.getBean("studentThree", Student.class);
        System.out.println(student);
    }
    @Test
    public void testDI2() {
        ApplicationContext ioc = IOCUtil.getIOC();
        Student studentFour = ioc.getBean("studentFour", Student.class);
        System.out.println(studentFour.getGender());
    }
}
