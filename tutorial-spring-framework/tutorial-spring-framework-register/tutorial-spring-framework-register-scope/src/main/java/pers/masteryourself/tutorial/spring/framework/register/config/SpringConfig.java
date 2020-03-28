package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pers.masteryourself.tutorial.spring.framework.register.bean.Person;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 20:53
 */
@Configuration
public class SpringConfig {

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(name = "person")
    public Person person() {
        return new Person("张三");
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean(name = "person2")
    public Person person2() {
        return new Person("李四");
    }

}