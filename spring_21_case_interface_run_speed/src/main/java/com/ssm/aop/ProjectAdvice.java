package com.ssm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by e1hax on 2022-08-31.
 */
@Component
@Aspect
public class ProjectAdvice {

    //匹配业务层的所有方法
    @Pointcut("execution(* com.ssm.service.*Service.*(..))")
    public void servicePt(){}

    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        //获取执行签名信息
        Signature signature = pjp.getSignature();
        //通过签名获取执行类型(接口名)
        String className = signature.getDeclaringTypeName();
        //通过签名获取执行操作名称(方法名)
        String methodName = signature.getName();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行："+className+"."+methodName+"--->"+(end-start)+" ms");
    }
}
