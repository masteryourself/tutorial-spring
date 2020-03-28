package pers.masteryourself.tutorial.spring.framework.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.config.SpringConfig;

/**
 * <p>description : AwareApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:05
 */
public class AwareApplication {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(SpringConfig.class);
        // {setBeanName} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // beanName is：pers.masteryourself.tutorial.spring.framework.injection.config.MyAware
        // {setBeanFactory} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // pers.masteryourself.tutorial.spring.framework.injection.config.MyAware@382db087
        // {setEnvironment} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // 当前 encoding：UTF-8
        // {setEmbeddedValueResolver} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // my os is [Windows 10]
        // {setApplicationEventPublisher} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // applicationEventPublisher is：org.springframework.context.annotation.AnnotationConfigApplicationContext@7eda2dbb, started on Sun Mar 29 02:10:03 CST 2020
        // {setApplicationContext} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // applicationContext 是否属于 AnnotationConfigApplicationContext：true
        // {setImportMetadata} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // 获取注解信息：{value=[class pers.masteryourself.tutorial.spring.framework.injection.config.MyAware]}
    }

}
