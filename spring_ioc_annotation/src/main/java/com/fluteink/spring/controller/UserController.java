package com.fluteink.spring.controller;

import com.fluteink.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 明宇
 * @version 1.0
 */
@Controller("yyy")
public class UserController {
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserController() {
    }

    @Autowired
    private UserService userService;

    public void saveUser() {
        userService.saveUser();
    }
}
