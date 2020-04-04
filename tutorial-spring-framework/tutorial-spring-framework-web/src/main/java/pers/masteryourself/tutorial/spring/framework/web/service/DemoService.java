package pers.masteryourself.tutorial.spring.framework.web.service;

import org.springframework.stereotype.Service;

/**
 * <p>description : DemoService
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/4 17:21
 */
@Service
public class DemoService {

    public String say() {
        return "say hello";
    }

}
