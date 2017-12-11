package com.txc.springInAction.chap1.service.impl;

import com.txc.springInAction.chap1.service.Knight;
import com.txc.springInAction.chap1.service.Quest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by tanxiaocan on 2017/12/4.
 */

public class BraveKnight implements Knight,BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean{
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
        System.out.println("BraveKnight【构造器】调用构造器实例化");
    }

    public BraveKnight(){
        System.out.println("BraveKnight【构造器】调用无参构造器实例化");
    }


    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        System.out.println("【注入属性】注入属性quest");
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
    }

    public void myInit(){
        System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    public void myDestroy(){
        System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }
}
