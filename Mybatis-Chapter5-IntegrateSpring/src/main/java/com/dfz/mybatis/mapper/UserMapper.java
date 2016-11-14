package com.dfz.mybatis.mapper;

import com.dfz.mybatis.model.Article;
import com.dfz.mybatis.model.User;

import java.util.List;

/**
 * Created by zhangsiyuan on 2016/11/2.
 */
public interface UserMapper {

    public User selectUserByID(int id);

    public List<User> viewByUsername(String username);

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);

    public List<Article> getUserArticles(int userId);
}
