package com.fluteink.mybatis.test;

import com.fluteink.mybatis.mapper.EmpMapper;
import com.fluteink.mybatis.pojo.Emp;
import com.fluteink.mybatis.pojo.EmpExample;
import com.fluteink.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 */
public class MBGTest {
    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
//        List<Emp> emps = mapper.selectByExample(null);
//        System.out.println(emps);
//        EmpExample empExample = new EmpExample();
//        empExample.createCriteria().andEmpNameLike("张三").andAgeGreaterThanOrEqualTo(20);
//        empExample.or().andGenderEqualTo("男");
//        List<Emp> emps = mapper.selectByExample(empExample);
//        emps.forEach(System.out::println)
        Emp emp = new Emp(1, "小黑", null, "女");
        mapper.updateByPrimaryKeySelective(emp);

    }
}
