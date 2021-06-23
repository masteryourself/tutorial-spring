package pers.masteryourself.tutorial.spring.framework.extension.beanfactorypostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.extension.beanfactorypostprocessor.bean.Cat;
import pers.masteryourself.tutorial.spring.framework.extension.beanfactorypostprocessor.config.SpringConfig;

/**
 * <p>description : ExtensionBeanFactoryPostProcessor
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/22 16:09
 */
public class ExtensionBeanFactoryPostProcessor {

    public static void main(String[] args) {
        // MyBeanDefinitionRegistryPostProcessor 先执行了
        // MyBeanFactoryPostProcessor 后执行了
        // Cat(name=helloKitty)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(context.getBean(Cat.class));
        context.close();
    }

}
