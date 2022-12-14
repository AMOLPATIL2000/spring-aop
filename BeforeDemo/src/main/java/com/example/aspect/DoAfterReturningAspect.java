package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoAfterReturningAspect {

    @AfterReturning(
            pointcut = "execution (* com.example.beans.SimpleServiceImpl.sayHello(..))", returning= "result")
    public void doAfterReturning(JoinPoint joinPoint, Object result) {

        System.out.println("***AspectJ*** DoAfterReturning() is running!! intercepted : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + result);

    }

}