package com.example.demo.controller;

import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

public class BookController {
    @Autowired
    BookService bookService;

    @ResponseBody
    @RequestMapping("/getAllBook.do")
    public String getAllBook(){
        System.out.println("getAllBook");
        String result;
        result = bookService.getAllBook();
        result = "{\"code\":0,\"msg\":\"\",\"count\":1000,\"data\":" + result;
        result = result + "}";
        return result;
    }

    @ResponseBody
    @RequestMapping("/selectBorrowBook.do")
    public String selectBorrowBook(int uid){
        uid = 1;
        System.out.println("selectBorrowBook");
        String result;
        result = bookService.selectBorrowBook(uid);
        result = "{\"code\":0,\"msg\":\"\",\"count\":10,\"data\":" + result;
        result = result + "}";
        return result;
    }
}
