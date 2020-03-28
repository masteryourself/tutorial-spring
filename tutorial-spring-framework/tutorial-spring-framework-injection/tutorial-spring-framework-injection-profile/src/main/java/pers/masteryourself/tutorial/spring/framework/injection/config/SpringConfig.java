package pers.masteryourself.tutorial.spring.framework.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pers.masteryourself.tutorial.spring.framework.injection.bean.Datasource;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:31
 */
@Configuration
public class SpringConfig {

    @Profile("default")
    @Bean
    public Datasource localDatasource(){
        return new Datasource("local");
    }

    @Profile("dev")
    @Bean
    public Datasource devDatasource(){
        return new Datasource("dev");
    }

    @Profile("test")
    @Bean
    public Datasource testDatasource(){
        return new Datasource("test");
    }

    @Profile("prod")
    @Bean
    public Datasource prodDatasource(){
        return new Datasource("prod");
    }

}
