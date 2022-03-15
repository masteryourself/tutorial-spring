package org.masteryourself.tutorial.spring.framework.listener.listener;

import org.masteryourself.tutorial.spring.framework.listener.event.MessageEvent;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * <p>description : AnnoEventListener
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/15 4:40 PM
 */
@Component
public class AnnoEventListener {

    @EventListener(MessageEvent.class)
    public void get(MessageEvent event) {
        System.out.println("接收到 MessageEvent 事件: " + event.getName());
    }

    @EventListener(PayloadApplicationEvent.class)
    public void get(PayloadApplicationEvent<Object> event) {
        System.out.println("接收到包装事件: " + event.getPayload());
    }

}
