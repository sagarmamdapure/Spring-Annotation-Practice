package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaTennisCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (tennisCoach == alphaTennisCoach);
        System.out.println("Pointing to the same object : " + result);
        System.out.println("Memory location for tennisCoach : " + tennisCoach);
        System.out.println("Memory location for alphaTennisCoach : " + alphaTennisCoach);

        context.close();
    }
}
