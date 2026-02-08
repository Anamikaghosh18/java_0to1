package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        // IOC - Inversion of control
        // control of object creation and lifecycle management is transferred from application code to an external container

        // Dependency Injection
        // the dependencies will be injected (provided externally) instead of creating within the class.
        // Contructor injection -> dependencies provided through the constructor
        // Setter injection ->

        // Beans = an object that is managed by the framework

        // Spring Container - manage all the objects
        // ApplicationContext
        // BeanFactory
    }

}
