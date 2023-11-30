package com.example.project.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GetAndSetAspect {

    @Pointcut("execution(* com.example.project.User.get*())")
    public void getMethodsUser(){}

    @Pointcut("execution(* com.example.project.User.set*())")
    public void setMethodsUser(){}
    @Pointcut("execution(* com.example.project.Task.get*())")
    public void getMethodsTask(){}

    @Before("getMethodsUser()")
    public void beforeGetAdviceUser() {
        System.out.println("getAndSetAspect beforeGetAdviceTask");
    }
    @Before("setMethodsUser()")
    public void  beforeSetAdviceUser() {
        System.out.println("getAndSetAspect beforeSetAdviceProject");
    }
    @Before("getMethodsTask()")
    public void  beforeGetAdviceTask() {
        System.out.println("getAndSetAspect beforeGetAdviceUser");
    }
}
