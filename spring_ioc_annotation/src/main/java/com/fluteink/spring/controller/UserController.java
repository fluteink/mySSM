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
    @Autowired
    private UserService userService;

    public void saveUser() {
        userService.saveUser();
    }
}
