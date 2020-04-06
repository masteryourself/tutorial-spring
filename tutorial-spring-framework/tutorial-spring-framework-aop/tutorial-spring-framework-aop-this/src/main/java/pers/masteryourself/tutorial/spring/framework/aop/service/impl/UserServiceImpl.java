package pers.masteryourself.tutorial.spring.framework.aop.service.impl;

import org.springframework.stereotype.Service;

/**
 * <p>description : UserServiceImpl
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 1:37
 */
@Service
public class UserServiceImpl {

    public void get(String name) {
        System.out.println("执行 get()");
    }

}
