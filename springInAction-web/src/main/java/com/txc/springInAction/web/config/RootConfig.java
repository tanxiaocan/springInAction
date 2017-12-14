package com.txc.springInAction.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by tanxiaocan on 2017/12/14.
 */

@Configuration
@ComponentScan(basePackages = "com.txc.springInAction.web",
excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
}
