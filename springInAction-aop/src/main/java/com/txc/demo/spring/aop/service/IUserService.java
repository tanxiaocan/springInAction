package com.txc.demo.spring.aop.service;

import org.springframework.stereotype.Service;

/**
 * Created by tanxiaocan on 2017/12/13.
 * @author tanxiaocan
 */
@Service
public interface IUserService {
    /**
     * add user into db
     */
    void addUser();
}
