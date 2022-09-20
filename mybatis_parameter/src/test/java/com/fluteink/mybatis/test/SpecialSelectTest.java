package com.fluteink.mybatis.test;

import com.fluteink.mybatis.mappers.SpecialSelectMapper;
import com.fluteink.mybatis.pojo.User;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public class SpecialSelectTest {
    @Test
    public void SpecialSelect() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSelectMapper mapper = sqlSession.getMapper(SpecialSelectMapper.class);
        List<User> a = mapper.SpecialSelect("a");
        a.forEach(System.out::println);
    }
    @Test
    public void deleteUsers() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSelectMapper mapper = sqlSession.getMapper(SpecialSelectMapper.class);
        mapper.deleteUsers("11,12");
    }
    @Test
    public void searchusertables() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSelectMapper mapper = sqlSession.getMapper(SpecialSelectMapper.class);
        List<User> t_user = mapper.searchUsers("t_user");
        t_user.forEach(System.out::println);
    }
}
