package pers.masteryourself.tutorial.spring.boot.servlet.config;

import org.springframework.boot.web.embedded.tomcat.ConfigurableTomcatWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>description : MyEmbeddedServletContainerCustomizer
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 19:43
 */
@Configuration
public class WebServerFactoryCustomizerConfig {

    @Bean
    public WebServerFactoryCustomizer<ConfigurableTomcatWebServerFactory> webServerFactoryWebServerFactoryCustomizer() {
        return factory -> {
            // 定制嵌入式的 Servlet 容器相关的规则
            factory.setPort(9999);
        };
    }

}
