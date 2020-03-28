package pers.masteryourself.tutorial.spring.framework.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.injection.controller.PersonController;

/**
 * <p>description : QualifierApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:46
 */
public class QualifierApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonController personController = context.getBean(PersonController.class);
        // PersonController(personService2=PersonService(label=1))
        System.out.println(personController);
    }

}
