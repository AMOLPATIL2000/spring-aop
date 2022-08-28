package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspect {

    @Before("execution (* com.example.beans.SimpleServiceImpl.sayHello(..))")
    public void doBefore(JoinPoint joinPoint)
    {
        System.out.println("AspectJ DoBefore is Running " + joinPoint.getSignature().getName());
    }
}
