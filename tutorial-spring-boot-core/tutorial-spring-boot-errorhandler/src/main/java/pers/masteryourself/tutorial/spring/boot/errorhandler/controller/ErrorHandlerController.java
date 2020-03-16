package pers.masteryourself.tutorial.spring.boot.errorhandler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>description : ErrorHandlerController
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 18:35
 */
@RestController
public class ErrorHandlerController {

    @GetMapping(value = "test")
    public String test() {
        int i = 10 / 0;
        return "error";
    }

}
