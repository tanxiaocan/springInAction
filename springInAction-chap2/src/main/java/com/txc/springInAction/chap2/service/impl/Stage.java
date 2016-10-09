package com.txc.springInAction.chap2.service.impl;

/**
 * Created by xiaocantan on 2016/10/8.
 */
public class Stage {
    private Stage(){}
    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }
    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
    public void run(){
        System.out.println("可以开始表演了...");
    }
}
