package pers.masteryourself.tutorial.spring.framework.injection.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringValueResolver;

import java.util.Map;

/**
 * <p>description : MyAware
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:05
 */
public class MyAware implements ApplicationEventPublisherAware, BeanFactoryAware, EnvironmentAware,
        EmbeddedValueResolverAware, BeanNameAware, ApplicationContextAware, ImportAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setBeanFactory"));
        System.out.println(beanFactory.getBean("pers.masteryourself.tutorial.spring.framework.injection.config.MyAware"));
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setBeanName"));
        System.out.println("beanName is：" + beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setApplicationContext"));
        System.out.println("applicationContext 是否属于 AnnotationConfigApplicationContext：" +
                (applicationContext instanceof AnnotationConfigApplicationContext));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setApplicationEventPublisher"));
        System.out.println("applicationEventPublisher is：" + applicationEventPublisher);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setEmbeddedValueResolver"));
        System.out.println(resolver.resolveStringValue("my os is [${os.name}]"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setEnvironment"));
        System.out.println("当前 encoding：" + environment.getProperty("file.encoding"));
    }

    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setImportMetadata"));
        Map<String, Object> attributes = annotationMetadata.getAnnotationAttributes(Import.class.getName());
        System.out.println("获取注解信息：" + attributes);
    }
}
