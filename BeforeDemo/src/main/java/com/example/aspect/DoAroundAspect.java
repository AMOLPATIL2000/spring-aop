package com.example.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DoAroundAspect {

    @Around("execution(* com.example.beans.SimpleServiceImpl.sayHello(..))")
    public void doAround(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("***AspectJ*** DoAround() is running!! intercepted : " +  joinPoint.getSignature().getName()
                + " \narguments : " + Arrays.toString(joinPoint.getArgs()));

        System.out.println("***AspectJ*** DoAround() before is running!");
        joinPoint.proceed(); // continue on the intercepted method
        System.out.println("***AspectJ*** DoAround() after is running!");

    }

}