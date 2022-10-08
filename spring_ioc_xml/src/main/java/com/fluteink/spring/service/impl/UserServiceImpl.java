package com.fluteink.spring.service.impl;

import com.fluteink.spring.dao.UserDao;
import com.fluteink.spring.service.UserService;

/**
 * @author 明宇
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {

    }
}
