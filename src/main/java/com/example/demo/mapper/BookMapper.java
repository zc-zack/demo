package com.example.demo.mapper;

import com.example.demo.entity.Book;

import java.util.List;

public interface BookMapper {

    /*
    * 获取所有书本
    * */
    List<Book> selectAllBook();

    /*
    * 插入新的图书
    * */
    int insertBook(Book book);

    List<Book> getAllBook();
}