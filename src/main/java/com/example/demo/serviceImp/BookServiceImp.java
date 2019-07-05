package com.example.demo.serviceImp;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.Book;
import com.example.demo.entity.Borrow;
import com.example.demo.entity.User;
import com.example.demo.mapper.BookMapper;
import com.example.demo.mapper.BorrowMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImp implements BookService {

    @Autowired
    private BookMapper bookMapper;
    private BorrowMapper borrowMapper;
    private UserMapper userList;


    @Override
    public String getAllBook() {
        String result;
        List<Book> userList = bookMapper.getAllBook();
        result = JSON.toJSON(userList).toString();
        return result;
    }

    @Override
    public String selectBorrowBook(int uid) {
        String result;
        List<Borrow> borrowList = borrowMapper.getBorrowList(uid);
        //还没写完
        List<Book> userList = bookMapper.selectBookByBid(uid);
        result = JSON.toJSON(userList).toString();
        return result;
    }
}
