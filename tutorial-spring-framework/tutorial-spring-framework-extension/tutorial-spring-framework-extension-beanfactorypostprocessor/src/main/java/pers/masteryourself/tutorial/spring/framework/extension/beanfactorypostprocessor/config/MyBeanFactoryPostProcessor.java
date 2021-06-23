package pers.masteryourself.tutorial.spring.framework.extension.beanfactorypostprocessor.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyBeanFactoryPostProcessor
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/22 16:23
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor 后执行了");
        if (beanFactory.containsBean("cat")) {
            beanFactory.getBeanDefinition("cat").getConstructorArgumentValues().addGenericArgumentValue("helloKitty");
        }
    }

}
