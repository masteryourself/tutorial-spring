package org.masteryourself.tutorial.spring.framework.extension.bean;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyMergedBeanDefinitionPostProcessor
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/13 3:40 PM
 */
@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

    /**
     * 6. Bean 后置处理器: 执行 bean 构造方法之后执行
     * 给一个机会在创建完 bean 实例之后再修改 beanDefinition
     *
     * @param beanDefinition
     * @param beanType
     * @param beanName
     */
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        System.out.println("MyMergedBeanDefinitionPostProcessor postProcessMergedBeanDefinition");
    }

}
