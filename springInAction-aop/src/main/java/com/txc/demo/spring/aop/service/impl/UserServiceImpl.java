package com.txc.demo.spring.aop.service.impl;

import com.txc.demo.spring.aop.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by tanxiaocan on 2017/12/13.
 */
@Service
public class UserServiceImpl implements IUserService{
    @Override
    public void addUser() {
        System.out.println("a user have been added!");
    }
}
