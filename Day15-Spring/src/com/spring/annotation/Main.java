package com.spring.annotation;

import com.springproject.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/annotation/appCxt.xml");
        com.spring.annotation.Employee employee = (com.spring.annotation.Employee) context.getBean("employee");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getPhone());
    }
}
