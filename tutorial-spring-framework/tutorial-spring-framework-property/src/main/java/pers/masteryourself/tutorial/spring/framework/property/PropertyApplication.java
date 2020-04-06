package pers.masteryourself.tutorial.spring.framework.property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.property.bean.Person;
import pers.masteryourself.tutorial.spring.framework.property.config.SpringConfig;

/**
 * <p>description : PropertyApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:12
 */
public class PropertyApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person person = context.getBean(Person.class);
        // Person{id=2, name='zs', address='china', age=19}
        System.out.println(person);
        // china
        System.out.println(context.getEnvironment().getProperty("person.address"));
    }

}
