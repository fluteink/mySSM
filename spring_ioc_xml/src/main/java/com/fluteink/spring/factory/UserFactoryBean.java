package com.fluteink.spring.factory;

import com.fluteink.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 明宇
 * @version 1.0
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
