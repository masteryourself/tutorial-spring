package pers.masteryourself.tutorial.spring.boot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>description : MyBatisAnnotationApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/16 22:41
 */
@MapperScan(value = "pers.masteryourself.tutorial.spring.boot.mybatis.mapper")
@SpringBootApplication
public class MyBatisAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisAnnotationApplication.class, args);
    }

}
