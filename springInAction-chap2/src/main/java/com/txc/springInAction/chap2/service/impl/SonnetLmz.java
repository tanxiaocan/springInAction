package com.txc.springInAction.chap2.service.impl;

import com.txc.springInAction.chap2.service.Poem;

/**
 * Created by xiaocantan on 2016/10/8.
 */
public class SonnetLmz implements Poem {
    private static String[] LINE = {
            "不吃力，不做作，不雕琢，不紧张，不声嘶力竭，",
            "我们说，这是潇洒",
            "..."
    };
    public void recite() {
        for (int i = 0; i < LINE.length; i++) {
            System.out.println(LINE[i]);
        }
    }
}
