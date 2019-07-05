package com.example.demo.mapper;

import com.example.demo.entity.User;

public interface UserMapper {
    User signup(String username, String password, Integer role);
    User findUserByUid(int uid);
}