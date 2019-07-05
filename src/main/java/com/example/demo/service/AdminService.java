package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Book;

import java.util.List;

public interface AdminService {


    /*
    * 获取所有图书返回List格式
    * */
    List<Book> getBookList();

    /*
    * 获取所有图书返回JSON格式
    * */
    JSONObject getBookJSON();

    /*
     *格式化JSON数据
     * */
    JSONObject formatBookJSON(List<Book> list);
}
