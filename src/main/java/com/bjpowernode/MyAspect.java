package com.bjpowernode;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class MyAspect {
    /*@Before(value = "execution(*  *..*..*.do*(..))")
    public void myBfore(){
        System.out.println("前置通知：输出日志");
    }
    @AfterReturning(value = "execution(* *..*..*.doo*(..))",returning = "ret")
    public Object myAfter(Object ret){
        School school = null;
        if (ret!=null){
            school = (School)ret;
            school.setName("beida");
        }
        System.out.println("后置通知：提交事务");
        return school;
    }*/

    /*@Around(value = "execution(* *..*..*.do*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知；前面输出日志");
        Object result=null;
        result = pjp.proceed();
        if (result==null){
            System.out.println("这个方法没有返回值");
        }else {
            System.out.println("这个方法返回值为:"+result);
        }
        System.out.println("环绕通知；后面提交事务");
        return result;
    }*/

}
