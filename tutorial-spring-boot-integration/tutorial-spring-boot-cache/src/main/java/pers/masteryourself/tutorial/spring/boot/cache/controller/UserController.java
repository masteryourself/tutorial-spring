package pers.masteryourself.tutorial.spring.boot.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.masteryourself.tutorial.spring.boot.cache.entity.User;
import pers.masteryourself.tutorial.spring.boot.cache.service.UserService;

/**
 * <p>description : UserController
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/21 22:32
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("find/{id}")
    public User find(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @GetMapping("update/{id}")
    public User update(@PathVariable Integer id) {
        User user = userService.findById(id);
        user.setUserName("修改：" + user.getUserName());
        return userService.update(user);
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        userService.delete(id);
        return "success";
    }

}
