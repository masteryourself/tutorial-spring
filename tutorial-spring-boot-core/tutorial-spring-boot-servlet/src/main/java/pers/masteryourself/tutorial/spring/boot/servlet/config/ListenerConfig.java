package pers.masteryourself.tutorial.spring.boot.servlet.config;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.masteryourself.tutorial.spring.boot.servlet.listener.MyListener;

/**
 * <p>description : ListenerConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 20:10
 */
@Configuration
public class ListenerConfig {

    @Bean
    public ServletListenerRegistrationBean<MyListener> myListener() {
        ServletListenerRegistrationBean<MyListener> listenerRegistrationBean = new ServletListenerRegistrationBean<>();
        listenerRegistrationBean.setListener(new MyListener());
        return listenerRegistrationBean;
    }

}
