package pers.masteryourself.tutorial.spring.framework.lifecycle.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import pers.masteryourself.tutorial.spring.framework.lifecycle.bean.Principal;
import pers.masteryourself.tutorial.spring.framework.lifecycle.bean.Student;
import pers.masteryourself.tutorial.spring.framework.lifecycle.bean.Teacher;

/**
 * <p>description : ExtBeanPostProcessor
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:49
 */
public class ExtBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student || bean instanceof Teacher || bean instanceof Principal) {
            System.out.printf("%s =================>>>>>>>>>>>>> postProcessBeforeInitialization\n", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student || bean instanceof Teacher || bean instanceof Principal) {
            System.out.printf("%s =================>>>>>>>>>>>>> postProcessAfterInitialization\n", beanName);
        }
        return bean;
    }

}
