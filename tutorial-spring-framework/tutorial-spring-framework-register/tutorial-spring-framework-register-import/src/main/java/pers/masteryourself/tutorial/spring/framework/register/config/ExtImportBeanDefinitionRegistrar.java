package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import pers.masteryourself.tutorial.spring.framework.register.bean.Mouse;

import java.util.Map;

/**
 * <p>description : ExtImportBeanDefinitionRegistrar
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:08
 */
public class ExtImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(Import.class.getName());
        // 获取注解元数据：
        // {value=[
        // class pers.masteryourself.tutorial.spring.framework.register.bean.Cat,
        // class pers.masteryourself.tutorial.spring.framework.register.config.ExtImportSelector,
        // class pers.masteryourself.tutorial.spring.framework.register.config.ExtImportBeanDefinitionRegistrar]
        // }
        System.out.println("获取注解元数据：" + annotationAttributes);
        // 指定 bean 定义信息
        BeanDefinition beanDefinition = new RootBeanDefinition(Mouse.class);
        // 手工注册
        registry.registerBeanDefinition("mouse", beanDefinition);
    }

}
