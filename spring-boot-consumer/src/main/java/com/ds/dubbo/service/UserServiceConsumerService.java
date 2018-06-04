package com.ds.dubbo.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.ds.dubbo.model.User;
import org.springframework.stereotype.Component;

/**
 * 用户Dubbo 服务消费者
 * @author duosheng
 * @since 2018/6/4
 */
@Component
public class UserServiceConsumerService {

    @Reference
    UserService userService;

    public User saveUser() {
        User user = new User();
        user.setUsername("admin").setPassword("admin");
        return userService.save(user);
    }
}
