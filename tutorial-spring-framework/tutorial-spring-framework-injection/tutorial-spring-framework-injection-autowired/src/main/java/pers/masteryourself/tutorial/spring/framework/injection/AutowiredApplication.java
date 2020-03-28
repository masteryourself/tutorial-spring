package pers.masteryourself.tutorial.spring.framework.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.injection.controller.PersonController;

/**
 * <p>description : AutowiredApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:38
 */
public class AutowiredApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonController personController = context.getBean(PersonController.class);
        // PersonController(personService2=PersonService(label=2))
        System.out.println(personController);
    }

}
