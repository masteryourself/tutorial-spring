package pers.masteryourself.tutorial.spring.framework.injection.autowired.core;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.controller.ConstructController;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.controller.FiledController;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.controller.MethodController;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.controller.ParameterController;

/**
 * <p>description : AutowiredApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:38
 */
public class AutowiredCoreApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        FiledController filedController = context.getBean(FiledController.class);
        // FiledController(someBean2=SomeBean(label=2))
        System.out.println(filedController);
        MethodController methodController = context.getBean(MethodController.class);
        // MethodController(someBean=SomeBean(label=1))
        System.out.println(methodController);
        ConstructController constructController = context.getBean(ConstructController.class);
        // ConstructController(someBean=SomeBean(label=2))
        System.out.println(constructController);
        ParameterController parameterController = context.getBean(ParameterController.class);
        // ParameterController(someBean=SomeBean(label=1))
        System.out.println(parameterController);
    }

}
