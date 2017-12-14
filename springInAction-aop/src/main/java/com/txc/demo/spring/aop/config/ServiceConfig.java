package com.txc.demo.spring.aop.config;

import com.txc.demo.spring.aop.aop.LogAspect;
import com.txc.demo.spring.aop.service.impl.UserServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by tanxiaocan on 2017/12/13.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = {UserServiceImpl.class, LogAspect.class})
public class ServiceConfig {
}
