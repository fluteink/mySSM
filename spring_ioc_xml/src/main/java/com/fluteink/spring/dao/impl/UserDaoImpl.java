package com.fluteink.spring.dao.impl;

import com.fluteink.spring.dao.UserDao;

/**
 * @author 明宇
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {


    @Override
    public void saveUser() {
        System.out.println("Save Success!");
    }
}
