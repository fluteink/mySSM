package com.fluteink.mybatis.mappers;

import com.fluteink.mybatis.pojo.User;

/**
 * @author 明宇
 * @version 1.0
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    User getUserByUsername(String username);
}
