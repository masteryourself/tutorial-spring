package pers.masteryourself.tutorial.spring.boot.servlet.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.masteryourself.tutorial.spring.boot.servlet.servlet.MyServlet;

/**
 * <p>description : ServletConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 19:56
 */
@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean<MyServlet> myServlet() {
        return new ServletRegistrationBean<>(new MyServlet(), "/myServlet");
    }

}
