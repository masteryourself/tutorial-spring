package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDateTime;

/**
 * <p>description : BatCondition
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:01
 */
public class BatCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        return hour >= 18 || hour <= 6;
    }

}
