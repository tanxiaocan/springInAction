package com.txc.springInAction.chap2.service.impl;

import com.txc.springInAction.chap2.service.Poem;

/**
 * Created by xiaocantan on 2016/10/8.
 */
public class Sonnet implements Poem {
    private static String[] LINE = {
            "一株挺拔的大树在风中自然地飘摇，",
            "它没有固定的姿态",
            "..."
    };
    public void recite() {
        for (int i = 0; i < LINE.length; i++) {
            System.out.println(LINE[i]);
        }
    }
}
