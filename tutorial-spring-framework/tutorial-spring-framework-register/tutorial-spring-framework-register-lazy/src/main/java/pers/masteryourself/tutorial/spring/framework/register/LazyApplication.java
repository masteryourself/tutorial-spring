package pers.masteryourself.tutorial.spring.framework.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.register.bean.Person;
import pers.masteryourself.tutorial.spring.framework.register.config.SpringConfig;

/**
 * <p>description : LazyApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 20:57
 */
public class LazyApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // ioc 容器创建完成
        System.out.println("ioc 容器创建完成");
        // 创建 peron 对象
        context.getBean("person", Person.class);
        context.getBean("person", Person.class);
    }

}
