package com.bjpowernode;

public class ServiceImpl implements Service {
    @Override
    public void dosome(String name, int age) {
        System.out.println("执行业务方法dosome");
    }
    public School dooter(School school){
        System.out.println("执行业务方法dooter");
        school=new School();
        school.setAdress("beijing");
        school.setName("qinghua");
        return school;
    }
}
