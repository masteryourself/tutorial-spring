package pers.masteryourself.tutorial.spring.framework.postprocessor.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyBeanFactoryPostProcessor
 * beanFactory 的后置处理器，在 BeanFactory 标准初始化之后调用，来定制和修改 BeanFactory 的内容
 * 所有的 bean 定义已经保存加载到 beanFactory，但是 bean 的实例还未创建
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 22:13
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println(String.format("================ {%s} %s", "MyBeanFactoryPostProcessor", "postProcessBeanFactory 执行了"));
        System.out.println(String.format("================ {%s} bean 的数量是 %d", "MyBeanFactoryPostProcessor", beanFactory.getBeanDefinitionCount()));
    }

}
