package com.atguigu.test;


import com.atguigu.test.bean.Emp;
import com.atguigu.test.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testBean1(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testBean2(){
        //1.加载spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
