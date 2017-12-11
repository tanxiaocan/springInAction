package com.txc.springInAction.chap1.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.PrintStream;

/**
 * Created by tanxiaocan on 2017/12/5.
 */
@Data
public class Minstrel {

    public Minstrel(){
        System.out.println("Minstrel【构造器】调用无参构造器实例化");
    }

    public void singBeforeQuest(){
        System.out.println("fa la la,the knight is so brave!");
    }

    public void singAfterQuest(){
        System.out.println("tee hee hee,the brave knight did embark on a quest!");
    }
}
