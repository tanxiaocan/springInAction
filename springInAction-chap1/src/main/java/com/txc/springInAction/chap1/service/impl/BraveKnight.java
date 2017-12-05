package com.txc.springInAction.chap1.service.impl;

import com.txc.springInAction.chap1.service.Knight;
import com.txc.springInAction.chap1.service.Quest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tanxiaocan on 2017/12/4.
 */

@Data
public class BraveKnight implements Knight{
    private Quest quest;

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
