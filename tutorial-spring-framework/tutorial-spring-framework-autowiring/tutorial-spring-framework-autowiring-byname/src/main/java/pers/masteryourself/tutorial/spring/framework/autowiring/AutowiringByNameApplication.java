package pers.masteryourself.tutorial.spring.framework.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.autowiring.bean.Person;
import pers.masteryourself.tutorial.spring.framework.autowiring.config.SpringConfig;

/**
 * <p>description : AutowiringApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/5 2:37
 */
public class AutowiringByNameApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }

}
