package com.txc.springInAction.chap2.service.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by xiaocantan on 2016/10/8.
 */
@Service
//@Lazy
public class Auditorium {
    @PostConstruct
    public void turnOnLights(){
        System.out.println("开灯了...");
    }
    @PreDestroy
    public void turnOffLights(){
        System.out.println("关灯了...");
    }
}
