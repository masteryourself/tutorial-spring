package pers.masteryourself.tutorial.spring.boot.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.masteryourself.tutorial.spring.boot.mybatis.entity.Book;
import pers.masteryourself.tutorial.spring.boot.mybatis.mapper.BookMapper;

import java.util.List;

/**
 * <p>description : BookController
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/16 21:50
 */
@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("list")
    public List<Book> list() {
        return bookMapper.list();
    }

}
