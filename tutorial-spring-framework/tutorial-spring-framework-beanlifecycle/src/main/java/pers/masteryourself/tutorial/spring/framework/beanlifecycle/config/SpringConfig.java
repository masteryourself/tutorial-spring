package pers.masteryourself.tutorial.spring.framework.beanlifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pers.masteryourself.tutorial.spring.framework.beanlifecycle.bean.Student;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:50
 */
@Configuration
@Import(ExtBeanPostProcessor.class)
@ComponentScan("pers.masteryourself.tutorial.spring.framework.beanlifecycle")
public class SpringConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Student student() {
        return new Student();
    }

}
