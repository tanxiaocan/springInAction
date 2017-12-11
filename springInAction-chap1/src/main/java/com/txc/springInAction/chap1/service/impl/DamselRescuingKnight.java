package com.txc.springInAction.chap1.service.impl;

import com.txc.springInAction.chap1.service.Knight;
import com.txc.springInAction.chap1.service.Quest;
import lombok.Data;

/**
 * Created by tanxiaocan on 2016/10/7.
 */
@Data
public class DamselRescuingKnight implements Knight {
    private Quest quest;

    public DamselRescuingKnight(){
        System.out.println("DamselRescuingKnight【构造器】调用无参构造器实例化");
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
