package com.txc.springInAction.chap1.compnant;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Iterator;

/**
 * Created by tanxiaocan on 2017/12/7.
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println("这是BeanFactoryPostProcessor实现类构造器！！");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out
                .println("BeanFactoryPostProcessor调用postProcessBeanFactory方法");
        BeanDefinition bd = beanFactory.getBeanDefinition("quest");
        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
        while (beanNamesIterator.hasNext()){
            System.out.println(beanNamesIterator.next());
        }
        BeanDefinition beanPostProcessor = beanFactory.getBeanDefinition("beanPostProcessor");

//        System.out.println(beanPostProcessor);
//        bd.getPropertyValues().addPropertyValue("phone", "110");
//        System.out.println(bd);
    }
}
