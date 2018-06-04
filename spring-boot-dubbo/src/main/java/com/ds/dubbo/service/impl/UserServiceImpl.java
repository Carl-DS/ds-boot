package com.ds.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ds.dubbo.model.User;
import com.ds.dubbo.service.UserService;

/**
 * @author duosheng
 * @since 2018/6/4
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User save(User user) {
        System.out.println(user.getUsername());
        return user;
    }
}
