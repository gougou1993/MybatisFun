package com.dfz.mybatis.test;

import com.dfz.mybatis.mapper.UserMapper;
import com.dfz.mybatis.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by zhangsiyuan on 2016/11/2.
 */
public class Chapter2InterfaceTest {

    private SqlSessionFactory sqlSessionFactory;
    private Reader reader;
    //test
    @Before
    public void before() {
        try {
            //读取mybatis参数
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            //建立session factory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        //打开session
        SqlSession session = sqlSessionFactory.openSession();
        //使用接口方式调用查找方法
        User user = session.getMapper(UserMapper.class).selectUserByID(1);
        System.out.println(user);
        session.close();
    }
}
