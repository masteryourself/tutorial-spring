package pers.masteryourself.tutorial.spring.framework.aop.service;

/**
 * <p>description : PersonServiceImpl
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 0:30
 */
public class PersonService {

    public void query(String name) {
        System.out.println("执行 query()");
    }

    public String save(String name) {
        System.out.println("执行 save()");
        return "save() 成功";
    }

}
