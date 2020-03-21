package pers.masteryourself.tutorial.spring.boot.starter.sample.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pers.masteryourself.tutorial.spring.boot.starter.sample.SampleService;

/**
 * <p>description : SampleTest
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/21 21:54
 */
@SpringBootApplication
public class SampleServiceTestApplication implements CommandLineRunner {

    @Autowired
    private SampleService sampleService;

    public static void main(String[] args) {
        SpringApplication.run(SampleServiceTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(sampleService.say("hello"));
    }

}
