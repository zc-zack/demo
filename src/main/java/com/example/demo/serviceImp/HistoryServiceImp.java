package com.example.demo.serviceImp;

import com.example.demo.entity.Book;
import com.example.demo.entity.Borrow;
import com.example.demo.entity.History;
import com.example.demo.entity.User;
import com.example.demo.mapper.BookMapper;
import com.example.demo.mapper.BorrowMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryServiceImp implements HistoryService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BorrowMapper borrowMapper;


    @Override
    public List<History> getHistory() {

        List<History> historyList = new ArrayList<History>();
        List<Borrow> borrowList = new ArrayList<Borrow>();

        // 获取所有借阅信息
        borrowList = borrowMapper.findAllBorrow();

        // 测试
        for (Borrow temp : borrowList) {
            System.out.println("Borrow:::"+temp);
        }


        // 获取所有借阅用户和对应图书
        List<User> userList = new ArrayList<User>();
        List<Book> bookList = new ArrayList<Book>();
        for (Borrow temp : borrowList) {
            userList.add(userMapper.findUserByUid(temp.getUid()));
            bookList.add(bookMapper.findBookByBid(temp.getBid()));
        }

        // 封装数据
        for (int i = 0; i < bookList.size(); i++) {
            History history = new History();
            history.setUserId(userList.get(i).getUid());
            history.setUsername(userList.get(i).getUsername());
            history.setBookName(bookList.get(i).getBookName());
            history.setAuthor(bookList.get(i).getAuthor());
            history.setPublish(bookList.get(i).getPublish());
            history.setBorrowTime(borrowList.get(i).getBorrowTime());
            history.setBackTime(borrowList.get(i).getBackTime());
        }

        // 测试
        for (History temp : historyList) {
            System.out.println("History::::"+temp);
        }

        return historyList;
    }
}
