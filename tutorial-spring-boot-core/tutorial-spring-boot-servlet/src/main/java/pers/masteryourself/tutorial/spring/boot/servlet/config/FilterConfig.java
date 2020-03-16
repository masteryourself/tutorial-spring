package pers.masteryourself.tutorial.spring.boot.servlet.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.masteryourself.tutorial.spring.boot.servlet.filter.MyFilter;

/**
 * <p>description : FilterConfig
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 20:09
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter> myFilter() {
        FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new MyFilter());
        return filterRegistrationBean;
    }

}
