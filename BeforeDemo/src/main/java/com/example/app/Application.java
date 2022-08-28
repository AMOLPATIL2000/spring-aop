package com.example.app;

import com.example.beans.SimpleServiceImpl;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        SimpleServiceImpl simpleService = context.getBean(SimpleServiceImpl.class);
        simpleService.sayHello("AMOL");
    }
}
