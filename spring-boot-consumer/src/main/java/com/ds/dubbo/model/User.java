package com.ds.dubbo.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author duosheng
 * @since 2018/6/4
 */
@Accessors(chain = true)
@Data
public class User {

    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
