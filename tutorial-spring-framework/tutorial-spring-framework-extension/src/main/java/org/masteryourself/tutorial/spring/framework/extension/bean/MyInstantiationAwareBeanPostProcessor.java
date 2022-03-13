package org.masteryourself.tutorial.spring.framework.extension.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyInstantiationAwareBeanPostProcessor
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/13 3:39 PM
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    /**
     * 4. Bean 后置处理器: 执行 bean 构造方法之前执行
     * 给 BeanPostProcessor 一个机会来返回一个对象
     * 如果返回的不为 null, 那么 Spring 容器就直接使用这个 bean, 并且后续只会执行 postProcessAfterInitialization() 方法
     * 如果返回的是 null, 那么则按照标准流程创建 bean 对象, 同时很多后置处理器的方法也会执行
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor postProcessBeforeInstantiation");
        return null;
    }

    /**
     * 7. Bean 后置处理器: [执行 bean 构造方法之后, 执行 bean 属性赋值之前] 执行
     * 在属性赋值之前, 后置处理器可以决定要不要为属性赋值
     * 返回 false 则表示不要赋值, populateBean() 过程直接结束
     * 因为这里已经获取到了 bean 对象, 可以交给用户自己赋值, 然后返回 false 跳过 Spring 容器的赋值操作
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor postProcessAfterInstantiation");
        return true;
    }

    /**
     * 8. Bean 后置处理器: 执行 bean 属性赋值之前执行
     * 在属性被设置到 bean 实例中之前，我们有机会拦截属性，并更改属性 (可以做一些自定义注解)
     * PropertyValues 即属性的健值对, Spring 会使用 pvs 进行属性赋值
     *
     * @param pvs
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor postProcessProperties");
        return pvs;
    }
}
