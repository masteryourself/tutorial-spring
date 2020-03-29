package pers.masteryourself.tutorial.spring.framework.postprocessor.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;
import pers.masteryourself.tutorial.spring.framework.postprocessor.bean.Cat;

/**
 * <p>description : MyBeanDefinitionRegistryPostProcessor
 * 在所有 bean 定义信息将要被加载，bean 实例还未创建，优先于 BeanFactoryPostProcessor 执行
 * 利用 BeanDefinitionRegistryPostProcessor 给容器中再额外添加一些组件
 * BeanDefinitionRegistry：Bean 定义信息的保存中心，以后 BeanFactory 就是按照 BeanDefinitionRegistry 里面保存的每一个 bean 定义信息创建 bean 实例
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 22:14
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
