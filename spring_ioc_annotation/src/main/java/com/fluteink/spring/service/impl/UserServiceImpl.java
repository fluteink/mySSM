package com.fluteink.spring.service.impl;

import com.fluteink.spring.dao.UserDao;
import com.fluteink.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 明宇
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.save();
    }
}
