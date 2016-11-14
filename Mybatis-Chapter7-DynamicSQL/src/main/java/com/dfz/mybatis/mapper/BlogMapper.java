package com.dfz.mybatis.mapper;

import com.dfz.mybatis.model.Blog;

/**
 * Created by zhangsiyuan on 2016/11/14.
 */
public interface BlogMapper {

    public Blog blogIfTest(Blog blog);

    public Blog blogChooseTest(Blog blog);

    public Blog blogTrimTest(Blog blog);
}
