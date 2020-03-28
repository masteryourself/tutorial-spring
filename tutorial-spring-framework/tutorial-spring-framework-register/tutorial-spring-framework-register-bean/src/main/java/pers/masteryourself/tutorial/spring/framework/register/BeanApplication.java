package pers.masteryourself.tutorial.spring.framework.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.register.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.register.bean.Person;

/**
 * <p>description : BeanApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/27 23:15
 */
public class BeanApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
        String[] names = context.getBeanNamesForType(Person.class);
        for (String name : names) {
            // beanName is：personXxx
            System.out.println("beanName is：" + name);
        }
    }

}
