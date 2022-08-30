package com.ssm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.ssm.dao.BookDao.update())")
    public void pt(){}
    @Pointcut("execution(int com.ssm.dao.BookDao.select())")
    public void pt2(){}

   // @Before("pt()")
    public void before(){
        System.out.println("before advice....");
    }

    //@After("pt()")
    public void after(){
        System.out.println("after advice....");
    }

    //@Around("pt()")  //环绕通知
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice....");
        //表示对原始操作的调用
        pjp.proceed();
        System.out.println("after advice....");

    }

    //@Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice....");
        //表示对原始操作的调用
        Integer res = (Integer) pjp.proceed();
        System.out.println("after advice....");
        return res+566;

    }

    //@AfterReturning("pt2() ")
    public void afterRunning(){
        System.out.println("afterRunning advice....");
    }

    @AfterThrowing("pt2()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice....");
    }



}
