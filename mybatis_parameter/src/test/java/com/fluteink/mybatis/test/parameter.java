package com.fluteink.mybatis.test;

import com.fluteink.mybatis.mappers.UserMapper;
import com.fluteink.mybatis.pojo.User;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 明宇
 * @version 1.0
 */
public class parameter {
    @Test
    public void testgetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User admin = mapper.getUserByUsername("admin");
        System.out.println(admin);
    }

    @Test
    public void checkLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User admin = mapper.checkLogin("admin", "123456");
        System.out.println(admin);
    }
}
