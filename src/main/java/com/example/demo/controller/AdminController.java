package com.example.demo.controller;

import com.example.demo.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 管理员index页面
 */
@Controller
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin/admin";
    }
    //
}
