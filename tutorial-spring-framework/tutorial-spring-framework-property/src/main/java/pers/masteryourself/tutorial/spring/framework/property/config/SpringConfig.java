package pers.masteryourself.tutorial.spring.framework.property.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import pers.masteryourself.tutorial.spring.framework.property.bean.Person;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:18
 */
@Configuration
@PropertySource(value = "classpath:person.properties")
@Import(Person.class)
public class SpringConfig {

}
