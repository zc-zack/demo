package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Book;
import com.example.demo.entity.History;

import java.util.List;

public interface HistoryService {

    List<History> getHistory();

    JSONObject getHistoryJSON();

    JSONObject formatHistoryJSON(List<History> list);

}
