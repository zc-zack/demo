package com.example.demo.controller;

import com.example.demo.entity.History;
import com.example.demo.entity.User;
import com.example.demo.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HistoryController {

    @Autowired
    private HistoryService historyService;


    // 获取历史信息
    @RequestMapping("/history")
    public ModelAndView history() {

        ModelAndView modelAndView = new ModelAndView();

        // 获取session中的登录信息
        //session.getAttribute("user");
        // 根据uid获取用户信息
        User user = new User();

        List<History> historyList = historyService.getHistory();

        modelAndView.setViewName("index");
        modelAndView.addObject("user", user);
        modelAndView.addObject("historyList", historyList);

        return modelAndView;
    }
}
