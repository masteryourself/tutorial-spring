package org.masteryourself.tutorial.microservice.order.mq.config;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>description : OrikaConfig
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 22:07
 */
@Configuration
public class OrikaConfig {

    @Bean
    public MapperFacade mapperFacade() {
        return new DefaultMapperFactory.Builder().build().getMapperFacade();
    }

}
