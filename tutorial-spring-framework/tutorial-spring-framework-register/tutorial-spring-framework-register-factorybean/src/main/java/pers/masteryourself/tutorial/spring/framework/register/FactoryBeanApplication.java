package pers.masteryourself.tutorial.spring.framework.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.register.bean.Person;
import pers.masteryourself.tutorial.spring.framework.register.config.PersonFactoryBean;
import pers.masteryourself.tutorial.spring.framework.register.config.SpringConfig;

/**
 * <p>description : FactoryBeanApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:32
 */
public class FactoryBeanApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 调用了 PersonFactoryBean.getObject() 方法
        Person person = context.getBean("person", Person.class);
        // 加上 & 表示获取 FactoryBean 对应的 bean
        PersonFactoryBean personFactoryBean = context.getBean("&person", PersonFactoryBean.class);
        System.out.println(person);
        System.out.println(personFactoryBean);
    }

}
