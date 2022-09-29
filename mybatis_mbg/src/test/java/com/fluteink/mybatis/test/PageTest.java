package com.fluteink.mybatis.test;

import com.fluteink.mybatis.mapper.EmpMapper;
import com.fluteink.mybatis.pojo.Emp;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        Page<Object> page = PageHelper.startPage(2, 4);
        List<Emp> emps = mapper.selectByExample(null);
        PageInfo<Emp> PageInfo = new PageInfo<>(emps, 5);
        emps.forEach(System.out::println);
        System.out.println(PageInfo);

    }
}
