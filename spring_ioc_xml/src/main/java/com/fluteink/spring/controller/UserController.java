package com.fluteink.spring.controller;

import com.fluteink.spring.service.UserService;
import com.fluteink.spring.service.impl.UserServiceImpl;

/**
 * @author 明宇
 * @version 1.0
 */
public class UserController {


    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
