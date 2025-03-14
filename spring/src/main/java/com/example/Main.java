package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) context.getBean("alien");
        obj.code();
        // Alien obj2 = (Alien) context.getBean("alien");
        // obj2.code();
    }
}
