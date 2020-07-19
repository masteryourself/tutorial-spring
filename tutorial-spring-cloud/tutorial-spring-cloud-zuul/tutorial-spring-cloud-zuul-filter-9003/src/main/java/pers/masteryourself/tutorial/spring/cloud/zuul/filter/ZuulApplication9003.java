package pers.masteryourself.tutorial.spring.cloud.zuul.filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <p>description : ZuulApplication9003
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/19 13:10
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication9003 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication9003.class, args);
    }

}
