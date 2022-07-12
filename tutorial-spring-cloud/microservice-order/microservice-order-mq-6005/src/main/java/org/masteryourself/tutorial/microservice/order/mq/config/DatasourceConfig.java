package org.masteryourself.tutorial.microservice.order.mq.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * <p>description : DatasourceConfig
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/7/12 14:03
 */
@Configuration
public class DatasourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.order")
    public DataSource dataSource() {
        return new DruidDataSource();
    }

}
