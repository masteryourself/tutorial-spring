package pers.masteryourself.tutorial.spring.cloud.consumer.feign.loadbalance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>description : ConsumerApplication6004
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/4 14:18
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerApplication6004 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication6004.class, args);
    }

    /**
     * 方式一：使用代码覆盖默认负载均衡策略
     * 默认使用轮询策略
     *
     * @return {@link IRule}
     */
    /*@Bean
    public IRule randomRule() {
        return new RandomRule();
    }*/

}
