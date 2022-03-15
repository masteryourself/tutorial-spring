package org.masteryourself.tutorial.spring.framework.listener.publish;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * <p>description : EventPublish
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/15 5:00 PM
 */
@Component
public class EventPublish implements ApplicationEventPublisherAware {

    private static ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        publisher = applicationEventPublisher;
    }

    public static ApplicationEventPublisher getApplicationEventPublisher() {
        return publisher;
    }

}
