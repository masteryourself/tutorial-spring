package pers.masteryourself.tutorial.spring.framework.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.aop.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.aop.service.BaseService;
import pers.masteryourself.tutorial.spring.framework.aop.service.PersonService;

/**
 * <p>description : AopIntroductionsApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 12:54
 */
public class AopIntroductionsApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BaseService personService = (BaseService) context.getBean(PersonService.class);
        personService.query("张三");
    }

}
