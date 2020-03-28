package pers.masteryourself.tutorial.spring.framework.lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pers.masteryourself.tutorial.spring.framework.lifecycle.bean.Principal;
import pers.masteryourself.tutorial.spring.framework.lifecycle.bean.Student;
import pers.masteryourself.tutorial.spring.framework.lifecycle.bean.Teacher;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:50
 */
@Configuration
@Import(ExtBeanPostProcessor.class)
public class SpringConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Student student() {
        return new Student();
    }

    @Bean
    public Teacher teacher() {
        return new Teacher();
    }

    @Bean
    public Principal principal() {
        return new Principal();
    }

}
