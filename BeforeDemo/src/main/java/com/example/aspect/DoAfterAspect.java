package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoAfterAspect {

    @After("execution (* com.example.beans.SimpleServiceImpl.sayHello(..))")
    public void doAfter(JoinPoint joinPoint) {

        System.out.println("***AspectJ*** DoAfter() is running!! intercepted : " + joinPoint.getSignature().getName());

    }

}