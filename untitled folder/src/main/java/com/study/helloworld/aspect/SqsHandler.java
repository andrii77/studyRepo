package com.study.helloworld.aspect;

import com.study.helloworld.annotation.Auth;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class SqsHandler {

    @Pointcut("@annotation(auth)")
    public void authPointcut(Auth auth){}

    @Before("authPointcut(auth)")
    public void doSomeCheck(JoinPoint joinPoint, Auth auth){
        System.out.println("PERMISSIONS BEFORE ================================ "+auth.value());
    }

    @After("execution(* com.study.helloworld.service.AuthService.login(..))")
    public void doSomeCheck2(JoinPoint joinPoint){
        System.out.println("PERMISSIONS BEFORE ================================ "+joinPoint.getSignature());
    }
}
