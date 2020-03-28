package pers.masteryourself.tutorial.spring.framework.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pers.masteryourself.tutorial.spring.framework.injection.controller.PersonController;
import pers.masteryourself.tutorial.spring.framework.injection.service.PersonService;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:54
 */
@Configuration
@Import(PersonController.class)
public class SpringConfig {

    @Bean
    public PersonService personService1() {
        return new PersonService("1");
    }

    @Bean
    public PersonService personService2() {
        return new PersonService("2");
    }

}
