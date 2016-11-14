package com.dfz.mybatis.mapper;

import com.dfz.mybatis.model.Blog;

import java.util.List;

/**
 * Created by zhangsiyuan on 2016/11/14.
 */
public interface BlogMapper {

    public Blog blogIfTest(Blog blog);

    public Blog blogChooseTest(Blog blog);

    public List<Blog> blogTrimTest(Blog blog);

    public Blog blogWhereTest(Blog blog);

    public List<Blog> blogForeachTest(List<Integer> ids);
}
