package com.txc.springInAction.chap2.service.impl;

import com.txc.springInAction.chap2.service.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by xiaocantan on 2016/10/8.
 */
@Component
public class Saxophone implements Instrument {

    @Autowired
    private Environment env;
    @Override
    public void play() {
        System.out.println("saxophone voice:TOOT TOOT TOOT");
        System.out.println(env.getProperty("aaa"));
    }
}
