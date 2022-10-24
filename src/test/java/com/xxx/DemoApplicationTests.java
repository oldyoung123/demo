package com.xxx;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xxx.domain.Book;
import com.xxx.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {

        List<Book> books = bookDao.selectList(null);
        System.out.println(books);
    }
    @Test
    void sellectByid(){
        System.out.println(bookDao.selectById(2l));
    }

    @Test
    void dividepages(){

        Book book = bookDao.selectById(1l);
        book.setPrice(2);
        Book book1 = bookDao.selectById(1l);
        book1.setPrice(22);
        bookDao.updateById(book);
        bookDao.updateById(book1);
    }

}
