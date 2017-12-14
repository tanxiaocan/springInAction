package com.txc.demo.spring.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by tanxiaocan on 2017/12/13.
 */
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.txc.demo.spring.aop.service.*.*(..))")
    public void pointcut(){};

    @Before("pointcut()")
    public void before(){
        System.out.println("aspect before advice");
    }

}
