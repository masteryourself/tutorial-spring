package org.masteryourself.tutorial.spring.framework.extension.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyBeanPostProcessor
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/13 3:36 PM
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * 9. Bean 后置处理器: 执行 bean 初始化方法之前执行
     * 可以改变之前创建的 bean 实例 (常用于做 aop 代理)
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor postProcessBeforeInitialization");
        return null;
    }

    /**
     * 10. Bean 后置处理器: 执行 bean 初始化方法之后执行
     * 可以改变之前创建的 bean 实例 (常用于做 aop 代理)
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor postProcessAfterInitialization");
        return null;
    }
}
