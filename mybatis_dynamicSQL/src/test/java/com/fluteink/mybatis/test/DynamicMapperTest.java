package com.fluteink.mybatis.test;

import com.fluteink.mybatis.mappers.DynamicSQLMapper;
import com.fluteink.mybatis.pojo.Emp;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        Emp emp = new Emp(null, "", null, "男");
        List<Emp> empsByCondition = mapper.getEmpsByCondition(emp);
        empsByCondition.forEach(System.out::println);
    }

    @Test
    public void getEmpsByChoose() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", null, "男");
        List<Emp> empsByChoose = mapper.getEmpsByChoose(emp);
        empsByChoose.forEach(System.out::println);
    }

    @Test
    public void testinsertEmps() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "xiaoming", 20, "男");
        Emp emp2 = new Emp(null, "wanghan", 20, "女");
        List<Emp> emps = Arrays.asList(emp, emp2);
        mapper.insertEmps(emps);
    }

    //    <!--    void deleteEmpsOne(@Param("empIds") Integer[] empIds);-->
    @Test
    public void testdeleteEmpsOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] a = {7, 8};
        mapper.deleteEmpsOne(a);
    }
//    void deleteEmpsTwo(@Param("empIds") Integer[] empIds);
@Test
public void testdeleteEmpsTwo() {
    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
    Integer[] a = {9, 10};
mapper.deleteEmpsTwo(a);
}
}
