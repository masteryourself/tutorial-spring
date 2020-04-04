package pers.masteryourself.tutorial.spring.framework.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * <p>description : SpringConfig，不扫描 {@link Controller} 标注的类
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/4 17:14
 */
@ComponentScan(value = "pers.masteryourself.tutorial.spring.framework.web", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
})
public class SpringConfig {
}
