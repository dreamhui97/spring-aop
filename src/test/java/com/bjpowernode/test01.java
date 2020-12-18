package com.bjpowernode;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Service service = (Service) applicationContext.getBean("someServiceTarget");
        //service.dosome("lisi",20);
        School school = (School) applicationContext.getBean("school");
        School school1 = service.dooter(school);
        System.out.println(school1);
    }
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Service service = (Service) applicationContext.getBean("someServiceTarget");
        School school = (School) applicationContext.getBean("school");
        service.dosome("lisi",20);
        System.out.println("====================");
        service.dooter(school);
    }
}
