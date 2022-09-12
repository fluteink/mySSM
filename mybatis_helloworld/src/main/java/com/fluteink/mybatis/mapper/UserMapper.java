package com.fluteink.mybatis.mapper;

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
}
