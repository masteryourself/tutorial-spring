package pers.masteryourself.tutorial.spring.framework.autowiring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/5 2:38
 */
@ImportResource({"classpath:spring.xml"})
@ComponentScan("pers.masteryourself.tutorial.spring.framework.autowiring")
public class SpringConfig {
}
