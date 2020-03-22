package pers.masteryourself.tutorial.spring.boot.actuator.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * <p>description : MyApplicationHealthIndicator
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/22 18:36
 */
@Component
public class MyApplicationHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return Health.up().withDetail("msg", "服务提供正常").build();
    }

}
