package org.masteryourself.tutorial.spring.framework.aop;

import org.masteryourself.tutorial.spring.framework.aop.config.SpringConfig;
import org.masteryourself.tutorial.spring.framework.aop.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>description : AopApplication
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/14 7:25 PM
 */
public class AopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonService service = context.getBean(PersonService.class);
        service.query("张三");
    }
}
