package pers.masteryourself.tutorial.spring.framework.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.listener.config.SpringConfig;

/**
 * <p>description : ListenerApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 22:56
 */
public class ListenerApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.publishEvent(new ApplicationEvent("hello spring annotation") {
        });
        context.close();
        // *************** MyAnnotationListener 接收到事件：class org.springframework.context.event.ContextRefreshedEvent
        // =============== MyApplicationListener 接收到事件：class org.springframework.context.event.ContextRefreshedEvent
        // *************** MyAnnotationListener 接收到事件：class pers.masteryourself.tutorial.spring.framework.listener.ListenerApplication$1
        // =============== MyApplicationListener 接收到事件：class pers.masteryourself.tutorial.spring.framework.listener.ListenerApplication$1
        // *************** MyAnnotationListener 接收到事件：class org.springframework.context.event.ContextClosedEvent
        // =============== MyApplicationListener 接收到事件：class org.springframework.context.event.ContextClosedEvent
    }

}
