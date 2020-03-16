package pers.masteryourself.tutorial.spring.boot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>description : MyBatisApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/16 21:42
 */
@SpringBootApplication
@MapperScan(value = "pers.masteryourself.tutorial.spring.boot.mybatis.mapper")
public class MyBatisXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisXmlApplication.class, args);
    }

}
