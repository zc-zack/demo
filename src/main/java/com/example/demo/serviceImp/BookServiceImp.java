package com.example.demo.serviceImp;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImp implements BookService {

    @Autowired
    private BookMapper bookMapper;


    @Override
    public String getAllBook() {
        String result;
        List<Book> userList = bookMapper.getAllBook();
        result = JSON.toJSON(userList).toString();
        return result;
    }
}
