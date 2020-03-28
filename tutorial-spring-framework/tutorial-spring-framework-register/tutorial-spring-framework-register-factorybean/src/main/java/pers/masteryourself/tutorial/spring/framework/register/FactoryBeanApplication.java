package pers.masteryourself.tutorial.spring.framework.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.register.bean.Person;
import pers.masteryourself.tutorial.spring.framework.register.config.PersonFactoryBean;
import pers.masteryourself.tutorial.spring.framework.register.config.SpringConfig;

/**
 * <p>description : FactoryBeanApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:32
 */
public class FactoryBeanApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 调用了 PersonFactoryBean.getObject() 方法
        Person person1 = context.getBean("person", Person.class);
        Person person2 = context.getBean("person", Person.class);
        // true
        System.out.println(person1 == person2);
        // class pers.masteryourself.tutorial.spring.framework.register.bean.Person
        System.out.println(person1.getClass());
        PersonFactoryBean personFactoryBean1 = context.getBean(PersonFactoryBean.class);
        PersonFactoryBean personFactoryBean2 = context.getBean("&person", PersonFactoryBean.class);
        // true
        System.out.println(personFactoryBean1 == personFactoryBean2);
        // class pers.masteryourself.tutorial.spring.framework.register.config.PersonFactoryBean
        System.out.println(personFactoryBean1.getClass());
    }

}
