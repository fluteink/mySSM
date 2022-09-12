package com.fluteink.mybatis.test;

import com.fluteink.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 明宇
 * @version 1.0
 */
public class MybatisTest {
    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();//不会自动提交事物
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insertUser();
//        int i = sqlSession.insert("com.fluteink.mybatis.mapper.UserMapper.insertUser");
        System.out.println("结果:  " + i);
//        sqlSession.commit();//提交事物
        sqlSession.close();//
    }

}
