package com.dfz.controller;

import com.dfz.mapper.UserMapper;
import com.dfz.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by zhangsiyuan on 2016/11/14.
 */
@Controller
@RequestMapping("/article")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/list")
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        List<Article> list = userMapper.getUserArticles(1);
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("articles", list);
        return mv;
    }
}
