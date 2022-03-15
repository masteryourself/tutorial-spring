package org.masteryourself.tutorial.spring.framework.listener;

import org.masteryourself.tutorial.spring.framework.listener.config.SpringConfig;
import org.masteryourself.tutorial.spring.framework.listener.event.MessageEvent;
import org.masteryourself.tutorial.spring.framework.listener.publish.EventPublish;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>description : ListenerApplication
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/15 4:37 PM
 */
public class ListenerApplication {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(SpringConfig.class);
        EventPublish.getApplicationEventPublisher().publishEvent(new MessageEvent("消息发送"));
        EventPublish.getApplicationEventPublisher().publishEvent(new Object());
    }

}
