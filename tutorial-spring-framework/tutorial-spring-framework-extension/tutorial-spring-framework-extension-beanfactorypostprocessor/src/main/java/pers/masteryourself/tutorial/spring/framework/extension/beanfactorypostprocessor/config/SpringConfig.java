package pers.masteryourself.tutorial.spring.framework.extension.beanfactorypostprocessor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pers.masteryourself.tutorial.spring.framework.extension.beanfactorypostprocessor.bean.Dog;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/22 16:11
 */
@Configuration
@ComponentScan("pers.masteryourself.tutorial.spring.framework.extension.beanfactorypostprocessor")
public class SpringConfig {

    @Bean
    public Dog dog() {
        return new Dog();
    }

}
