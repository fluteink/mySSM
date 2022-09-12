package com.fluteink.mybatis.mapper;

import com.fluteink.mybatis.pojo.User;

/**
 * @author 明宇
 * @version 1.0
 */
public interface UserMapper {
    /**
     * 添加用户信息
     *
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     *
     * @return
     */
    int updateUser();

    /**
     * 删除用户信息
     */
    int deleteUser();

    /**
     * 根据id查询用户
     */
    User getUserById();
}
