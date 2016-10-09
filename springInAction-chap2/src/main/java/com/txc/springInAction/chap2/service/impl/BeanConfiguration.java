package com.txc.springInAction.chap2.service.impl;

import com.txc.springInAction.chap2.service.Instrument;
import com.txc.springInAction.chap2.service.Performer;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xiaocantan on 2016/10/9.
 */
@Configuration
public class BeanConfiguration {
//    @Bean(autowire = Autowire.BY_NAME)
//    public Performer getPerformer(){
//        Instrumentalist instrumentalist = new Instrumentalist();
////        instrumentalist.setInstrument(getInstrument());
//        instrumentalist.setSong("let it go...");
//        return instrumentalist;
//    }
////
//    @Bean(name = "saxophone")
//    public Instrument getInstrument(){
//        return new Saxophone();
//    }
//
//    @Bean(name = "saxophone1")
//    public Instrument getInstrument1(){
//        return new Saxophone();
//    }
}
