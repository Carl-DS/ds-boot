package com.ds.security.oauth2.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author duosheng
 * @date 2018/5/7
 */
@RestController
public class TestEndpoints {

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "product id : " + id + "authentication==>" + authentication;
    }

    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "order id : " + id + "authentication==>" + authentication;
    }

    @RequestMapping("/user/me")
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }
}
