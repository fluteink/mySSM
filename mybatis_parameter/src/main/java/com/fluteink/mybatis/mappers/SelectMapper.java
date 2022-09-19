package com.fluteink.mybatis.mappers;

import com.fluteink.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 明宇
 * @version 1.0
 */
public interface SelectMapper {
    /**
     * 根据id查用户
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    List<User> getAllUsers();

    Integer getCount();

    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    List<Map<String, Object>> getAllUsersToMap();
}
