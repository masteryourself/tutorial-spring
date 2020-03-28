package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import pers.masteryourself.tutorial.spring.framework.register.dao.PersonDao;
import pers.masteryourself.tutorial.spring.framework.register.service.PersonService;

/**
 * <p>description : SpringConfig
 * 第一个 {@link ComponentScan} 排除了 {@link Repository} 和 {@link Controller} 注解，即只扫描了 {@link PersonService}
 * 第二个 {@link ComponentScan} 扫描了 {@link Controller} 注解类型和 {@link PersonDao} 类型，注意这里要把 useDefaultFilters 属性设置为 false
 * 第三个 {@link ComponentScan} 根据 {@link CustomTypeFilter} 自定义加载 bean
 *
 * <p>
 * FilterType.ANNOTATION 按照注解匹配
 * FilterType.ASSIGNABLE_TYPE 按照指定的类型
 * FilterType.ASPECTJ 使用 ASPECTJ 表达式
 * FilterType.REGEX 使用正则表达式
 * FilterType.CUSTOM 使用自定义方式
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 20:20
 */
@Configuration
@ComponentScan(
        value = "pers.masteryourself.tutorial.spring.framework.register",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Repository.class, Controller.class})}
)
@ComponentScan(
        value = "pers.masteryourself.tutorial.spring.framework.register",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = PersonDao.class)
        }, useDefaultFilters = false
)
@ComponentScan(value = "pers.masteryourself.tutorial.spring.framework.register", includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = CustomTypeFilter.class)
}, useDefaultFilters = false)
public class SpringConfig {
}
