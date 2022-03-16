package org.masteryourself.tutorial.spring.framework.mvc.controller;

import org.masteryourself.tutorial.spring.framework.mvc.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>description : DemoController
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/15 8:00 PM
 */
@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        return demoService.hello();
    }

}
