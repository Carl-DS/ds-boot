package com.ds.security.oauth2.web;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author duosheng
 * @date 2018/5/7
 */
@RestController
public class LoginController {

    @GetMapping("/authentication/require")
    public ModelAndView require() {
        return new ModelAndView("login");
    }

    @GetMapping("/authentication/user")
    public Authentication user(Authentication user) {
        return user;
    }
}
