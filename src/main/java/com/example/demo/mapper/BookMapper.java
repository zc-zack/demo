package com.example.demo.mapper;

import com.example.demo.entity.Book;

import java.util.List;

public interface BookMapper {

    /*
    * 获取所有书本
    * */
    List<Book> selectAllBook();

    List<Book> getAllBook();
}