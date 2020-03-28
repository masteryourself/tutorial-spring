package pers.masteryourself.tutorial.spring.framework.injection.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:05
 */
@Configuration
@Import({MyAware.class})
public class SpringConfig {

}
