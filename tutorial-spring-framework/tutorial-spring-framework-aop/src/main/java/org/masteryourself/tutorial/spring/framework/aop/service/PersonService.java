package org.masteryourself.tutorial.spring.framework.aop.service;

import org.springframework.stereotype.Service;

/**
 * <p>description : PersonService
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/14 7:32 PM
 */
@Service
public class PersonService {

    public void query(String name) {
        System.out.println("执行 query()");
    }

}

