package com.dfz.mybatis.test;

import com.dfz.mybatis.mapper.UserMapper;
import com.dfz.mybatis.model.Article;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by zhangsiyuan on 2016/11/2.
 */
public class Chapter5IntegrateSpring {

    private ApplicationContext ctx;

    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    }

    @Test
    public void test() {
        System.out.println("------------查询方法测试开始------------");
        UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
        System.out.println("------------测试查询用户------------");
        System.out.println(userMapper.selectUserByID(1));
        System.out.println("------------测试查询用户的文章------------");
        List<Article> articles = userMapper.getUserArticles(1);
        System.out.println(articles);
    }
}
