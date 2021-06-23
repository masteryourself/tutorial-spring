package pers.masteryourself.tutorial.spring.framework.extension._import.integration;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p>description : MapperScannerRegistrar
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/23 12:00
 */
public class MapperScannerRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AnnotationAttributes annoAttrs = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(EnableMasterYourSelf.class.getName()));
        if (annoAttrs == null) {
            return;
        }
        Class<?>[] mappers = annoAttrs.getClassArray("mappers");
        for (Class<?> mapper : mappers) {
            AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(SqlProxyBean.class).getBeanDefinition();
            beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(mapper);
            registry.registerBeanDefinition(mapper.getSimpleName(), beanDefinition);
        }
    }

}
