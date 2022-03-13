package pers.masteryourself.tutorial.spring.boot.errorhandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>description : ErrorHandlerController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 18:35
 */
@Controller
public class ErrorHandlerController {

    @GetMapping(value = "test")
    public String test(Model model) {
        model.addAttribute("k1","v1");
        return "/error/4xx.html";
    }

}
