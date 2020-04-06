package pers.masteryourself.tutorial.spring.framework.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.aop.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.aop.service.PersonService;

/**
 * <p>description : AopWithinApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 0:45
 */
public class AopWithinApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        personService.query("张三");
        System.out.println("*****************************分割线*****************************");
        personService.save("张三");
    }

}
