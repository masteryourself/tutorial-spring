package pers.masteryourself.tutorial.spring.framework.injection.autowired.qualifler;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.qualifler.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.qualifler.controller.PersonController;

/**
 * <p>description : AutowiredQualifierApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:46
 */
public class AutowiredQualifierApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        PersonController personController = context.getBean(PersonController.class);
        // PersonController(personService2=PersonService(label=1))
        System.out.println(personController);
    }

}
