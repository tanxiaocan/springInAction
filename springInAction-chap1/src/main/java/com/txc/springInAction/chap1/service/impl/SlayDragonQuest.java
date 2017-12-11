package com.txc.springInAction.chap1.service.impl;

import com.txc.springInAction.chap1.service.Quest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.PrintStream;

/**
 * Created by tanxiaocan on 2017/12/4.
 */

@Data
public class SlayDragonQuest implements Quest {
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream){
        this.printStream = printStream;
        System.out.println("SlayDragonQuest【构造器】调用构造器实例化");
    }

    @Override
    public void embark() {
        printStream.print("embarking on quest to slay the dragon!");
    }
}
