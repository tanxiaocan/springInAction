package com.txc.springInAction.chap1.config;

import com.txc.springInAction.chap1.service.Knight;
import com.txc.springInAction.chap1.service.Quest;
import com.txc.springInAction.chap1.service.impl.BraveKnight;
import com.txc.springInAction.chap1.service.impl.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tanxiaocan on 2017/12/6.
 */
@Configuration
public class ServiceConfig {

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }
}
