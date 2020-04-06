package pers.masteryourself.tutorial.spring.boot.async.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.masteryourself.tutorial.spring.boot.async.service.AsyncService;

/**
 * <p>description : AsyncController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/22 12:16
 */
@RestController
@RequestMapping("async")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("doSomething")
    public String doSomething(){
        asyncService.doSomething();
        return "success";
    }

}
