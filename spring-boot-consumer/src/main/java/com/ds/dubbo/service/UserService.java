package com.ds.dubbo.service;

import com.ds.dubbo.model.User;

/**
 * 用户Dubbo 服务
 *
 * @author duosheng
 * @since 2018/6/4
 */
public interface UserService {

    User save(User user);
}
