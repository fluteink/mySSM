package com.fluteink.mybatis.test;

import com.fluteink.mybatis.mapper.EmpMapper;
import com.fluteink.mybatis.pojo.Emp;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public class PageTest {
    @Test
    public void testPage()  {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(1,4);
        List<Emp> emps = mapper.selectByExample(null);
        emps.forEach(System.out::println);

    }
}
