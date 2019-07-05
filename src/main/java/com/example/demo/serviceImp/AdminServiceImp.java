package com.example.demo.serviceImp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getBookList() {
        return bookMapper.selectAllBook();
    }

    @Override
    public JSONObject getBookJSON() {
        return formatBookJSON(getBookList());
    }

    @Override
    public JSONObject formatBookJSON(List<Book> list) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 0);
        jsonObject.put("msg","");
        jsonObject.put("count", list.size());
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(list));
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    @Override
    public int addBook(JSONObject jsonObject) {
        Book book = JSON.parseObject(jsonObject.toJSONString(), Book.class);
        return bookMapper.insertBook(book);
    }

    @Override
    public int deleteBook(JSONObject jsonObject) {
        return bookMapper.deleteBookById((Integer) jsonObject.get("bid"));
    }

    @Override
    public int updateBook(JSONObject jsonObject) {
        return bookMapper.updateBookById(JSON.parseObject(jsonObject.toJSONString(), Book.class));
    }


}
