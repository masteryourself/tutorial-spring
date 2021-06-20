package pers.masteryourself.tutorial.spring.framework.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.injection.controller.FiledController;
import pers.masteryourself.tutorial.spring.framework.injection.controller.ParameterController;
import pers.masteryourself.tutorial.spring.framework.injection.controller.ConstructController;
import pers.masteryourself.tutorial.spring.framework.injection.controller.MethodController;

/**
 * <p>description : AutowiredApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:38
 */
public class AutowiredApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        FiledController filedController = context.getBean(FiledController.class);
        // PersonController(personService2=PersonService(label=2))
        System.out.println(filedController);
        MethodController methodController = context.getBean(MethodController.class);
        // UserController(personService=PersonService(label=1))
        System.out.println(methodController);
        ConstructController constructController = context.getBean(ConstructController.class);
        // TeacherController(personService=PersonService(label=2))
        System.out.println(constructController);
        ParameterController parameterController = context.getBean(ParameterController.class);
        // StudentController(personService=PersonService(label=1))
        System.out.println(parameterController);
    }

}
