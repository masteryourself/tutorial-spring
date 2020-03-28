package pers.masteryourself.tutorial.spring.framework.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.injection.controller.PersonController;
import pers.masteryourself.tutorial.spring.framework.injection.controller.StudentController;
import pers.masteryourself.tutorial.spring.framework.injection.controller.TeacherController;
import pers.masteryourself.tutorial.spring.framework.injection.controller.UserController;

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
        UserController userController = context.getBean(UserController.class);
        // UserController(personService=PersonService(label=1))
        System.out.println(userController);
        TeacherController teacherController = context.getBean(TeacherController.class);
        // TeacherController(personService=PersonService(label=2))
        System.out.println(teacherController);
        StudentController studentController = context.getBean(StudentController.class);
        // StudentController(personService=PersonService(label=1))
        System.out.println(studentController);
    }

}
