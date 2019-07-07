package com.example.demo.serviceImp;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.Book;
import com.example.demo.entity.Borrow;
import com.example.demo.entity.BorrowInfo;
import com.example.demo.entity.User;
import com.example.demo.mapper.BookMapper;
import com.example.demo.mapper.BorrowMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BorrowMapper borrowMapper;
    @Autowired
    private UserMapper userMapper;


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
        List<BorrowInfo> borrowInfoList = new ArrayList<>();
        for (Borrow borrow : borrowList){
            BorrowInfo borrowInfo = new BorrowInfo();
            Book book = bookMapper.findBookByBid(borrow.getBid());
            User user = userMapper.findUserByUid(uid);
            borrowInfo.setBookName(book.getBookName());
            borrowInfo.setPublish(book.getPublish());
            borrowInfo.setAuthor(book.getAuthor());
            borrowInfo.setUsername(user.getUsername());
            borrowInfo.setNumber(user.getNumber());
            borrowInfo.setBorrowTime(borrow.getBorrowTime());
            borrowInfo.setBackTime(borrow.getBackTime());
            borrowInfoList.add(borrowInfo);
        }
        result = JSON.toJSON(borrowInfoList).toString();
        System.out.println(result);
        return result;
    }
}
