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
        // beanName is：myAware
        // {setBeanFactory} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // pers.masteryourself.tutorial.spring.framework.injection.config.MyAware@6385cb26
        // {setEnvironment} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // 当前 encoding：UTF-8
        // {setEmbeddedValueResolver} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // my os is [Windows 10]
        // {setApplicationEventPublisher} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // applicationEventPublisher is：org.springframework.context.annotation.AnnotationConfigApplicationContext@7eda2dbb, started on Sun Mar 29 02:18:45 CST 2020
        // {setApplicationContext} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>
        // applicationContext 是否属于 AnnotationConfigApplicationContext：true
    }

}
