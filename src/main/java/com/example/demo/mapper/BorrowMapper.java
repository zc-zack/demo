package com.example.demo.mapper;

import com.example.demo.entity.Borrow;

import java.util.List;

public interface BorrowMapper {

    List<Borrow> getBorrowList(int uid);
    List<Borrow> findAllBorrow();
}