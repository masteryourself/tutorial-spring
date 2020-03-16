package pers.masteryourself.tutorial.spring.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <p>description : WebApplication
 * <p> {@link EnableWebMvc} 会导致 Spring Boot 对 Spring Mvc 的自动装配全部失效
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 13:54
 */
// @EnableWebMvc
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
