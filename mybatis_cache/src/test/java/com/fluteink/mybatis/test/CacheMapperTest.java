package com.fluteink.mybatis.test;

import com.fluteink.mybatis.mappers.CacheMapper;
import com.fluteink.mybatis.pojo.Emp;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 明宇
 * @version 1.0
 */
public class CacheMapperTest {
    @Test
    public void testGetEmpByEmpId() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.getEmpByEmpId(1);
        System.out.println(emp);
        Emp emp2 = mapper.getEmpByEmpId(1);
        System.out.println(emp2);
        SqlSession sqlSession2 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp3 = mapper2.getEmpByEmpId(1);
        System.out.println(emp3);
    }
}
