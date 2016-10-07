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
    public void embarkOnQuest() {
        quest.embark();
    }
}
