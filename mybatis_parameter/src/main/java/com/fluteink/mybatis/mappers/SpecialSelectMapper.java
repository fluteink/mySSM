package com.fluteink.mybatis.mappers;

import com.fluteink.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public interface SpecialSelectMapper {
    List<User> SpecialSelect(@Param("mohu") String mohu);
    void deleteUsers(@Param("ids") String ids);
    List<User> searchUsers(@Param("table") String table);
    void insertUser(User user);
}
