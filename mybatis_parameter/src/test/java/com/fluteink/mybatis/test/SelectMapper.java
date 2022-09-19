package com.fluteink.mybatis.test;

import com.fluteink.mybatis.pojo.User;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public class SelectMapper {
    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        com.fluteink.mybatis.mappers.SelectMapper mapper = sqlSession.getMapper(com.fluteink.mybatis.mappers.SelectMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
    }

    @Test
    public void getAllUsers() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        com.fluteink.mybatis.mappers.SelectMapper mapper = sqlSession.getMapper(com.fluteink.mybatis.mappers.SelectMapper.class);
        List<User> allUsers = mapper.getAllUsers();
        allUsers.forEach(System.out::println);
    }

    @Test
    public void getcount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        com.fluteink.mybatis.mappers.SelectMapper mapper = sqlSession.getMapper(com.fluteink.mybatis.mappers.SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }
}
