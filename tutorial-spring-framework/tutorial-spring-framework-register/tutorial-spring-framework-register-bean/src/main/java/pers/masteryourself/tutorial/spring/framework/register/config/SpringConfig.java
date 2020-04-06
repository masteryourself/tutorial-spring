package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.masteryourself.tutorial.spring.framework.register.bean.Person;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/27 23:15
 */
@Configuration
public class SpringConfig {

    /**
     * {@link Bean} 给容器注入一个 bean，类型为返回值的类型，id 默认是方法名作为 id，可以通过 name 修改
     *
     * @return
     */
    @Bean(name = "personXxx")
    public Person person() {
        return new Person();
    }

}
