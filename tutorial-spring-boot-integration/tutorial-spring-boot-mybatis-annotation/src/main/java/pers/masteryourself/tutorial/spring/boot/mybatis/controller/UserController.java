package pers.masteryourself.tutorial.spring.boot.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.masteryourself.tutorial.spring.boot.mybatis.entity.User;
import pers.masteryourself.tutorial.spring.boot.mybatis.mapper.UserMapper;

import java.util.List;

/**
 * <p>description : UserController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/16 21:51
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("list")
    public List<User> list() {
        return userMapper.list();
    }

}
