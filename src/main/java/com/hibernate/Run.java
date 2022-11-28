package com.hibernate;

import com.hibernate.multy.config.HibernateConf;
import com.hibernate.multy.models.User;
import com.hibernate.multy.service.UserService;
import com.hibernate.multy.service.impl.UserServiceImpl;
import com.hibernate.test.service.TestUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        test();
    }

    public static void multy(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConf.class);
        UserService userService = context.getBean(UserServiceImpl.class);
        User user = userService.get(1);
        System.out.println(user);
        context.close();
    }

    public static void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        TestUserService userService = context.getBean(TestUserService.class);
        User user = userService.get(1);
        System.out.println(user);

    }
}
