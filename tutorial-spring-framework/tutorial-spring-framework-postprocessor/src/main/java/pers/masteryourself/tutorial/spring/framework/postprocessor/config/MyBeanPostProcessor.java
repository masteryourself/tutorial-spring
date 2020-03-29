package pers.masteryourself.tutorial.spring.framework.postprocessor.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import pers.masteryourself.tutorial.spring.framework.postprocessor.bean.Person;

/**
 * <p>description : MyBeanPostProcessor
 * 在 spring bean 对象创建完成之后做一些事情
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 22:14
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Person) {
            System.out.println(String.format("**************** {%s} %s", "MyBeanPostProcessor", "postProcessBeforeInitialization 执行了"));
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Person) {
            System.out.println(String.format("**************** {%s} %s", "MyBeanPostProcessor", "postProcessAfterInitialization 执行了"));
        }
        return bean;
    }

}
