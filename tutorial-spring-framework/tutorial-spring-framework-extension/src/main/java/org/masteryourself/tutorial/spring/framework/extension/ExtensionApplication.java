package org.masteryourself.tutorial.spring.framework.extension;

import org.masteryourself.tutorial.spring.framework.extension.config.Person;
import org.masteryourself.tutorial.spring.framework.extension.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>description : ExtensionApplication
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/13 2:49 PM
 */
public class ExtensionApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
        context.close();
    }

}
