package pers.masteryourself.tutorial.spring.boot.druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

/**
 * <p>description : DruidApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 21:33
 */
@SpringBootApplication
public class DruidApplication implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(DruidApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("dataSource 类型是：" + dataSource.getClass());
    }

}

