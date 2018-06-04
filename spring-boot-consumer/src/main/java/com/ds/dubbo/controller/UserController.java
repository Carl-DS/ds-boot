package com.ds.dubbo.controller;

import com.ds.dubbo.model.User;
import com.ds.dubbo.service.UserServiceConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duosheng
 * @since 2018/6/4
 */
@RestController
public class UserController {

    @Autowired
    UserServiceConsumerService userServiceConsumerService;

    @GetMapping("/save")
    public User saveUser() {
        return userServiceConsumerService.saveUser();
    }
}
