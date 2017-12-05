package com.txc.springInAction.chap1.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.PrintStream;

/**
 * Created by tanxiaocan on 2017/12/5.
 */
//@AllArgsConstructor
@NoArgsConstructor
@Data
public class Minstrel {
    private PrintStream stream;

    public void singBeforeQuest(){
        stream.println("fa la la,the knight is so brave!");
    }

    public void singAfterQuest(){
        stream.println("tee hee hee,the brave knight did embark on a quest!");
    }
}
