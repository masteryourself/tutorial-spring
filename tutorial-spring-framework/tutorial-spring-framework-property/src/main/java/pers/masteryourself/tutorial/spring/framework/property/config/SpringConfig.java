package pers.masteryourself.tutorial.spring.framework.property.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:18
 */
@Configuration
@PropertySource(value = "classpath:person.properties")
@ComponentScan("pers.masteryourself.tutorial.spring.framework.property")
public class SpringConfig {

}
