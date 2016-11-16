package com.dfz.base;

/**
 * Created by zhangsiyuan on 2016/11/16.
 */
public interface BaseMapper<T extends BaseModel> {
    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(T record);
}
