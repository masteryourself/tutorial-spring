package pers.masteryourself.tutorial.spring.framework.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.aop.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.aop.service.PersonService;
import pers.masteryourself.tutorial.spring.framework.aop.service.impl.PersonServiceImpl;
import pers.masteryourself.tutorial.spring.framework.aop.service.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * <p>description : AopThisApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 1:22
 */
public class AopThisApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        personService.query("张三");
        System.out.println("*****************************分割线*****************************");
        personService.save("张三");
        // 使用 jdk 动态代理：true, false
        System.out.println(personService instanceof Proxy);
        System.out.println(personService instanceof PersonServiceImpl);
        System.out.println("*****************************分割线*****************************");
        UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        userService.get("张三");
    }

}
