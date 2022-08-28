package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoAfterThrowingAspect {

    @AfterThrowing(
            pointcut = "execution(* com.example.beans.SimpleServiceImpl.checkName(..))",
            throwing= "error")
    public void doAfterThrowing(JoinPoint joinPoint, Throwable error) {

        System.out.println("***AspectJ*** DoAfterThrowing() is running!! intercepted : " + joinPoint.getSignature().getName());
        System.out.println("Exception : " + error);
        System.out.println("******");

    }
}