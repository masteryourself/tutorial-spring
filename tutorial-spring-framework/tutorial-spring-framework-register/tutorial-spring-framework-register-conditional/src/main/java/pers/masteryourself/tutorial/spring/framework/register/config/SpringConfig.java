package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import pers.masteryourself.tutorial.spring.framework.register.bean.Animal;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:01
 */
@Configuration
public class SpringConfig {

    @Bean
    @Conditional(value = DogCondition.class)
    public Animal dog() {
        return new Animal("小狗");
    }

    @Bean
    @Conditional(value = BatCondition.class)
    public Animal bat() {
        return new Animal("蝙蝠");
    }
}
