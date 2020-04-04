package pers.masteryourself.tutorial.spring.framework.beanfactorypostprocessor.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;
import pers.masteryourself.tutorial.spring.framework.beanfactorypostprocessor.bean.Cat;

/**
 * <p>description : MyBeanDefinitionRegistryPostProcessor
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/5 2:21
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println(String.format(">>>>>>>>>>>>>>>> {%s} %s", "MyBeanDefinitionRegistryPostProcessor", "postProcessBeanFactory 执行了"));
        System.out.println(String.format(">>>>>>>>>>>>>>>> {%s} bean 的数量 %d", "MyBeanDefinitionRegistryPostProcessor", beanFactory.getBeanDefinitionCount()));
    }

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println(String.format(">>>>>>>>>>>>>>>> {%s} %s", "MyBeanDefinitionRegistryPostProcessor", "postProcessBeanDefinitionRegistry 执行了"));
        System.out.println(String.format(">>>>>>>>>>>>>>>> {%s} bean 的数量 %d", "MyBeanDefinitionRegistryPostProcessor", registry.getBeanDefinitionCount()));
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Cat.class).getBeanDefinition();
        registry.registerBeanDefinition("hello", beanDefinition);
    }

}
