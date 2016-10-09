package com.txc.springInAction.chap2.service.impl;

import com.txc.springInAction.chap2.service.Performer;

/**
 * Created by xiaocantan on 2016/10/8.
 */
public class Juggler implements Performer {
    private int beanBags;
    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }
    public void perform() {
        System.out.println("同时扔" + beanBags + "个豆袋子...");
    }
}
