package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/admin")
    public String admin(){
        return "admin/admin";
    }

    /*
    * 返回所有图书
    * */
    @RequestMapping("/getAllBook")
    @ResponseBody
    public JSONObject getAllBook(){
        return adminService.getBookJSON();
    }
}
