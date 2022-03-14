package org.masteryourself.tutorial.spring.framework.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/14 7:28 PM
 */
@Configuration
@ComponentScan(value = "org.masteryourself.tutorial.spring.framework.aop")
@EnableAspectJAutoProxy
public class SpringConfig {

}

