package pers.masteryourself.tutorial.spring.boot.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>description : LogApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/13 23:16
 */
@SpringBootApplication
@Slf4j
public class LogApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogApplication.class, args);
        log.error("这是 error 信息");
        log.warn("这是 warn 信息");
        log.info("这是 info 信息");
        log.debug("这是 debug 信息");
        log.trace("这是 trace 信息");
    }

}
