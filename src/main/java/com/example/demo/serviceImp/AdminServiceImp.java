package com.example.demo.serviceImp;

import com.alibaba.fastjson.JSON;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

/**
 * 管理员
 */
@Service
public class AdminServiceImp implements AdminService {

    private final UserMapper userMapper;

    public AdminServiceImp(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

}
