package pers.masteryourself.tutorial.spring.boot.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pers.masteryourself.tutorial.spring.boot.dubbo.service.SampleService;

/**
 * <p>description : ConsumerApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/22 14:16
 */
@SpringBootApplication
public class ConsumerApplication implements ApplicationRunner {

    @Reference(version = "1.0.1")
    private SampleService sampleService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(sampleService.say("张三"));
    }

}
