package com.txc.springInAction.chap2.service.impl;

import com.txc.springInAction.chap2.service.Instrument;
import org.springframework.stereotype.Service;

/**
 * Created by xiaocantan on 2016/10/8.
 */
//@Service("saxophone")
@Service
public class Saxophone implements Instrument {
    public void play() {
        System.out.println("saxophone voice:TOOT TOOT TOOT");
    }
}
