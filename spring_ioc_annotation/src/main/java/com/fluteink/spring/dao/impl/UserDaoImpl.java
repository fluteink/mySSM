package com.fluteink.spring.dao.impl;

import com.fluteink.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 明宇
 * @version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save!!!!");
    }
}
