package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:33
 */
@Configuration
public class SpringConfig {

    @Bean(name = "person")
    public PersonFactoryBean personFactoryBean() {
        return new PersonFactoryBean();
    }

}

