package com.txc.springInAction.chap2.config;

import com.txc.springInAction.chap2.service.Instrument;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by tanxiaocan on 2017/12/8.
 */

@Configuration
@ComponentScan(basePackageClasses = {Instrument.class})
@PropertySource({"classpath:app.properties"})
public class BeanConfig {
}
