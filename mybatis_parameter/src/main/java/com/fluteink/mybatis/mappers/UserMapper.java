package com.fluteink.mybatis.mappers;

import com.fluteink.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

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

    /**
     * 验证登录
     *
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录 用map集合
     *
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户信息
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 检查登录（使用@param）
     *
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParams(@Param("username") String username, @Param("password") String password);
}
