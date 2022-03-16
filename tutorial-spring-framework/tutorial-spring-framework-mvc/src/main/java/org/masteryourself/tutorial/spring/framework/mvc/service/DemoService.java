package org.masteryourself.tutorial.spring.framework.mvc.service;

import org.springframework.stereotype.Service;

/**
 * <p>description : DemoService
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/16 10:57 AM
 */
@Service
public class DemoService {

    public String hello() {
        return "hello world";
    }

}
