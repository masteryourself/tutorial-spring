package pers.masteryourself.tutorial.spring.framework.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.register.config.SpringConfig;

/**
 * <p>description : ImportApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:09
 */
public class ImportApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            // org.springframework.context.annotation.internalConfigurationAnnotationProcessor
            // org.springframework.context.annotation.internalAutowiredAnnotationProcessor
            // org.springframework.context.annotation.internalCommonAnnotationProcessor
            // org.springframework.context.event.internalEventListenerProcessor
            // org.springframework.context.event.internalEventListenerFactory
            // springConfig
            // pers.masteryourself.tutorial.spring.framework.register.bean.Cat
            // pers.masteryourself.tutorial.spring.framework.register.bean.Dog
            // mouse
            System.out.println(name);
        }
    }

}
