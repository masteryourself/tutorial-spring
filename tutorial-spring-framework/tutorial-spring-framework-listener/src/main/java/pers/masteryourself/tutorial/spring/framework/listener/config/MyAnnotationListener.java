package pers.masteryourself.tutorial.spring.framework.listener.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyAnnotationListener
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 22:56
 */
@Component
public class MyAnnotationListener {

    @EventListener(classes = {ApplicationEvent.class})
    public void applicationEventListen(ApplicationEvent event) {
        System.out.println("*************** MyAnnotationListener 接收到事件：" + event.getClass());
    }

}
