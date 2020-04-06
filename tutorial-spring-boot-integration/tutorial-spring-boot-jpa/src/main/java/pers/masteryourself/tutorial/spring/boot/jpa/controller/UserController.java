package pers.masteryourself.tutorial.spring.boot.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.masteryourself.tutorial.spring.boot.jpa.entity.User;
import pers.masteryourself.tutorial.spring.boot.jpa.repository.UserRepository;

import java.util.List;

/**
 * <p>description : UserController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/17 20:37
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("list")
    public List<User> queryAll() {
        return userRepository.findAll();
    }

}
