package com.ssm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by e1hax on 2022-08-31.
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.ssm.dao.BookDao.findName(..))")
    private void pt() {
    }

    //@Before("pt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

    //@After("pt()")
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

    //@Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0]=666;
        Object ret = pjp.proceed(args);
        return ret;
    }

    //@AfterReturning(value = "pt()",returning = "ret")
    public void afterReturning(JoinPoint jp,Object ret) {
        System.out.println("afterReturning advice ..."+ret);
    }

    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice ..."+t);
    }
}
