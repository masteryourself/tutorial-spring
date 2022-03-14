package org.masteryourself.tutorial.spring.framework.extension.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * <p>description : MySmartInstantiationAwareBeanPostProcessor
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/13 3:42 PM
 */
@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    /**
     * 这个方法可以改变 bean 的类型, 如果返回 null 表示不干预 Spring 的类型推断
     * 只有未创建的 bean 才会使用这个方法来判断, 创建好的 bean 对象意味着 BeanType 被确定了
     * 一般用于创建代理时返回的类型才会不一致
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }

    /**
     * 5. Bean 后置处理器: 执行 bean 构造方法之前执行
     * 返回要使用的构造器列表, 没有的话则默认使用无参构造器
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("MySmartInstantiationAwareBeanPostProcessor determineCandidateConstructors");
        return null;
    }

    /**
     * 这个是在发生循环依赖时, 依然可以使用后置处理器的回调方法
     * 三级缓存这个方法会调用: addSingletonFactory(beanName, () -> getEarlyBeanReference(beanName, mbd, bean))
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
