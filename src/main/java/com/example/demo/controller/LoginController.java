package com.example.demo.controller;



import com.example.demo.entity.User;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/signup")
    public String signup(){
        return "index";
    }
    @RequestMapping("/stuPage")
    public String stuPage(){
        return "stuPage";
    }

    @ResponseBody
    @RequestMapping("/handleSignup")
    public String handleSignup(String username, String password, String type, HttpSession session){
        User user = loginService.signup(username, password, type.equals("admin") ? 1 : 0);
        if(user != null){
            session.setAttribute("username", user.getUsername());
            session.setAttribute("uid", user.getUid());
            session.setAttribute("role", user.getRole());
            return "stuPage";
        }
        return "signup";
    }
}