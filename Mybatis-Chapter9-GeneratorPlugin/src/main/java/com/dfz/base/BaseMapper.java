package com.dfz.base;

import java.util.List;

/**
 * Created by zhangsiyuan on 2016/11/16.
 */
public interface BaseMapper<T extends BaseModel> {

    List<T> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(T record);
}
