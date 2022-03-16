package org.masteryourself.tutorial.spring.framework.mvc.isolation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/16 11:01 AM
 */
@Configuration
@ComponentScan(value = "org.masteryourself.tutorial.spring.framework.mvc", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, RestController.class})
})
public class SpringConfig {
}
