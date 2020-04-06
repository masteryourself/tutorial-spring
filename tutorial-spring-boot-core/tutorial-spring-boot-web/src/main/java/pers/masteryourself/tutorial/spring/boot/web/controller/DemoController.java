package pers.masteryourself.tutorial.spring.boot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>description : DemoController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 15:22
 */
@RestController
public class DemoController {

    @ResponseBody
    @RequestMapping("/demo")
    public String hello() {
        return "Hello Spring Boot!";
    }

}
