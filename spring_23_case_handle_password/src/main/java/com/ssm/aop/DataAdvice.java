package com.ssm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by e1hax on 2022-08-31.
 */
@Component
@Aspect
public class DataAdvice {
    @Pointcut("execution(boolean com.ssm.serivce.*Service.*(*,*))")
    private void servicePt(){}

    @Around("servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable{
        Object[] args = pjp.getArgs();

        for (int i = 0; i < args.length; i++) {
            //判断是不是字符串
            if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }
        Object ret = pjp.proceed(args);
        return  ret;
    }
}
