package pers.masteryourself.tutorial.spring.boot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * <p>description : JpaApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/17 20:30
 */
@SpringBootApplication
@EntityScan(basePackages = "pers.masteryourself.tutorial.spring.boot.jpa.bean")
@EnableJpaRepositories(basePackages = "pers.masteryourself.tutorial.spring.boot.jpa.repository")
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

}
