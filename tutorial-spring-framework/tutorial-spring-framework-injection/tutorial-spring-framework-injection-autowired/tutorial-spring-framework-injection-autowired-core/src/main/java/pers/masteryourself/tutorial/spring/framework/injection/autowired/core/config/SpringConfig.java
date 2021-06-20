package pers.masteryourself.tutorial.spring.framework.injection.autowired.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.bean.SomeBean;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.core.controller.ParameterController;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:41
 */
@Configuration
@ComponentScan("pers.masteryourself.tutorial.spring.framework.injection")
public class SpringConfig {

    @Bean
    public SomeBean someBean1() {
        return new SomeBean("1");
    }

    @Bean
    public SomeBean someBean2() {
        return new SomeBean("2");
    }

    @Bean
    public ParameterController studentController(/*@Autowired*/ SomeBean someBean1){
        return new ParameterController(someBean1);
    }

}
