package pers.masteryourself.tutorial.spring.framework.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pers.masteryourself.tutorial.spring.framework.injection.controller.ParameterController;
import pers.masteryourself.tutorial.spring.framework.injection.service.PersonService;

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
    public PersonService personService1() {
        return new PersonService("1");
    }

    @Bean
    public PersonService personService2() {
        return new PersonService("2");
    }

    @Bean
    public ParameterController studentController(/*@Autowired*/ PersonService personService1){
        return new ParameterController(personService1);
    }

}
