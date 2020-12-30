package pers.masteryourself.tutorial.spring.boot.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * <p>description : CacheApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/21 22:29
 */
@SpringBootApplication
@EntityScan(basePackages = "pers.masteryourself.tutorial.spring.boot.cache.entity")
@EnableJpaRepositories(basePackages = "pers.masteryourself.tutorial.spring.boot.cache.repository")
@EnableCaching
public class CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);
    }

}
