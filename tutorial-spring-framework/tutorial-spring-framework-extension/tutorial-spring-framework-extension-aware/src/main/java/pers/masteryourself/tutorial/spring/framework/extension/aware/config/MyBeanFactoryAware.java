package pers.masteryourself.tutorial.spring.framework.extension.aware.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyBeanFactoryAware
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/21 17:34
 */
@Component
public class MyBeanFactoryAware implements BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setBeanFactory"));
        System.out.println("容器中是否包含 dog 对象: " + beanFactory.containsBean("dog"));
    }

}
