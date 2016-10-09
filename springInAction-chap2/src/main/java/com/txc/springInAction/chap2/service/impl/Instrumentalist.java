package com.txc.springInAction.chap2.service.impl;

import com.txc.springInAction.chap2.service.Instrument;
import com.txc.springInAction.chap2.service.Performer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by xiaocantan on 2016/10/8.
 */
//@Getter
@Setter
@Service
public class Instrumentalist implements Performer {
    @Value("${newHouse.url}")
//    @Value("hehe")
//    @Value("#{T(java.lang.Math).PI}")
    private String song;
//    @Qualifier("saxophone")
//    @Inject
//    @Named("saxophone")
    @Value("#{saxophone}")
    private Instrument instrument;
    public void perform() {
        System.out.println("演奏歌曲" + song + "...");
        instrument.play();
    }
}
