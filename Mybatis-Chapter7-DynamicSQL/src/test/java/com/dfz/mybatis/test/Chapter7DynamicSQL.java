package com.dfz.mybatis.test;

import com.dfz.mybatis.mapper.BlogMapper;
import com.dfz.mybatis.model.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by zhangsiyuan on 2016/11/14.
 */
public class Chapter7DynamicSQL {
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
    public void testIf() {
        Blog blog = new Blog();
        System.out.println("------------测试content------------");
        blog.setContent("content2");
        SqlSession session = sqlSessionFactory.openSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        System.out.println(mapper.blogIfTest(blog));
        System.out.println("------------测试title------------");
        blog.setTitle("title1");
        System.out.println(mapper.blogIfTest(blog));
        session.close();
    }

    @Test
    public void testChoose() {
        Blog blog = new Blog();
        System.out.println("------------测试otherwise------------");
        blog.setContent("content2");
        SqlSession session = sqlSessionFactory.openSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        System.out.println(mapper.blogChooseTest(blog));
        System.out.println("------------测试choose------------");
        blog.setTitle("title1");
        System.out.println(mapper.blogChooseTest(blog));
        session.close();
    }

    @Test
    public void testTrim() {
        Blog blog = new Blog();
        System.out.println("------------测试otherwise------------");
//        blog.setContent("content2");
        blog.setOwner("owner3");
        SqlSession session = sqlSessionFactory.openSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        System.out.println(mapper.blogTrimTest(blog));
        session.close();
    }
}
