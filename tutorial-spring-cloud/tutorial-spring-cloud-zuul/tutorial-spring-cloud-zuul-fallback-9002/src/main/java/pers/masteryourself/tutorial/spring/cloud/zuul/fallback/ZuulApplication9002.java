package pers.masteryourself.tutorial.spring.cloud.zuul.fallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <p>description : ZuulApplication9001
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/19 12:21
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication9002 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication9002.class, args);
    }

}
