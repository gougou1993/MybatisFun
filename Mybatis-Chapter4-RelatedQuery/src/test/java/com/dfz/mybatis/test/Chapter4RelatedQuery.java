package com.dfz.mybatis.test;

import com.dfz.mybatis.mapper.UserMapper;
import com.dfz.mybatis.model.Article;
import com.dfz.mybatis.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by zhangsiyuan on 2016/11/2.
 */
public class Chapter4RelatedQuery {

    private SqlSessionFactory sqlSessionFactory;
    private Reader reader;

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
        System.out.println("------------查询方法测试开始------------");
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<Article> articles = userMapper.getUserArticles(1);
        System.out.println(articles);
    }
}
