package com.example.autowire.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowireByName.xml");
        Car myCar = (Car) context.getBean("car");
        myCar.displayDetails();
    }
}
