package pers.masteryourself.tutorial.spring.boot.starter.sample;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>description : SampleAutoConfiguration
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/21 21:14
 */
@Configuration
@ConditionalOnClass(SampleService.class)
@EnableConfigurationProperties(SampleProperties.class)
public class SampleAutoConfiguration {

    private SampleProperties properties;

    public SampleAutoConfiguration(SampleProperties properties) {
        this.properties = properties;
    }

    @Bean
    public SampleService sampleService() {
        return new SampleService(properties);
    }

}
