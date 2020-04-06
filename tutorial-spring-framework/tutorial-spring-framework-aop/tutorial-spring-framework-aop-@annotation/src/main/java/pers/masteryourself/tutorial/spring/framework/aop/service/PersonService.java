package pers.masteryourself.tutorial.spring.framework.aop.service;

import org.springframework.stereotype.Service;
import pers.masteryourself.tutorial.spring.framework.aop.config.MasterYourself;

/**
 * <p>description : PersonServiceImpl
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 0:30
 */
@Service
public class PersonService {

    public void query(String name) {
        System.out.println("执行 query()");
    }

    @MasterYourself
    public void save(String name) {
        System.out.println("执行 save()");
    }

}
