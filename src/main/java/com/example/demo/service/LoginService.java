package com.example.demo.service;

import com.example.demo.entity.User;

public interface LoginService {
    User signup(String username, String password, Integer role);
}
