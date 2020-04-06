package pers.masteryourself.tutorial.spring.framework.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.register.bean.Person;
import pers.masteryourself.tutorial.spring.framework.register.config.SpringConfig;

/**
 * <p>description : ScopeApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 20:52
 */
public class ScopeApplication {

    public static void main(String[] args) {
        // 【李四】 用户创建成功
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // ioc 容器创建完成
        System.out.println("ioc 容器创建完成");
        // 【张三】 用户创建成功
        Person person1 = context.getBean("person", Person.class);
        // 【张三】 用户创建成功
        Person person2 = context.getBean("person", Person.class);
        // false
        System.out.println(person1 == person2);
        context.getBean("person2", Person.class);
    }
    
}
