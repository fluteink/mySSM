package com.fluteink.mybatis.test;

import com.fluteink.mybatis.mappers.DynamicSQLMapper;
import com.fluteink.mybatis.pojo.Emp;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public class DynamicMapperTest {
    @Test
    public void getEmpsByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", 20, "男");
        List<Emp> empsByCondition = mapper.getEmpsByCondition(emp);
        empsByCondition.forEach(System.out::println);
    }
}
