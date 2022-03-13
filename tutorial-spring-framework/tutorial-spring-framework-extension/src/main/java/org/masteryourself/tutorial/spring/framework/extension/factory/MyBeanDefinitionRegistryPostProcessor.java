package org.masteryourself.tutorial.spring.framework.extension.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyBeanDefinitionRegistryPostProcessor
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/13 2:59 PM
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    public MyBeanDefinitionRegistryPostProcessor() {
        System.out.println("MyBeanDefinitionRegistryPostProcessor constructor");
    }

    /**
     * 1. BeanFactory 后置处理器
     * 可以使用 registry 完成一些注册工作
     *
     * @param registry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry");
    }

    /**
     * 2. BeanFactory 后置处理器
     * 可以获取到 beanFactory
     *
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor postProcessBeanFactory");
    }
}
