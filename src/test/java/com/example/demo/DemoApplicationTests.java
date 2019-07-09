package com.example.demo;

import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void contextLoads() {
        System.out.println(bookMapper.selectAllBook().get(0).getBid());
        Book book = new Book();
        book.setAuthor("测试");
        book.setBookName("测试书籍");
        book.setPublish("测试出版社");
        book.setResidue(123);

        System.out.println(bookMapper.selectBookByName("测试书籍").size());


    }

}
