package pers.masteryourself.tutorial.spring.framework.register.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.masteryourself.tutorial.spring.framework.register.bean.entity.Person;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/27 23:15
 */
@Configuration
public class SpringConfig {

    @Bean(name = "personXxx")
    public Person person() {
        return new Person();
    }

}
