package pers.masteryourself.tutorial.spring.boot.config;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import pers.masteryourself.tutorial.spring.boot.config.config.PersonProperties;
import pers.masteryourself.tutorial.spring.boot.config.service.SpringBeanService;

/**
 * <p>description : ConfigApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/13 21:21
 */
@SpringBootApplication
@EnableConfigurationProperties(PersonProperties.class)
@PropertySource(value = {"classpath:teacher.properties"})
@ImportResource(value = {"classpath:spring-bean.xml"})
public class ConfigApplication implements EnvironmentAware, ApplicationContextAware {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

    @Override
    public void setEnvironment(Environment environment) {
        // test.name1：zhangsan \n lisi
        System.out.println("test.name1：" + environment.getProperty("test.name1"));
        // test.name2：zhangsan
        // lisi
        System.out.println("test.name2：" + environment.getProperty("test.name2"));
        // test.name3：zhangsan \n lisi
        System.out.println("test.name3：" + environment.getProperty("test.name3"));
        // teacher.name：李四老师
        System.out.println("teacher.name：" + environment.getProperty("teacher.name"));
        // teacher.age：18
        System.out.println("teacher.age：" + environment.getProperty("teacher.age"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // PersonProperties：PersonProperties(lastName=张三, age=18, boss=false, birth=Wed Dec 12 00:00:00 CST 2018, maps={k1=v1, k2=12}, lists=[lisi, 19, wahaha], dog=DogProperties(name=wangwang, age=3))
        System.out.println("PersonProperties：" + applicationContext.getBean(PersonProperties.class));
        // SpringBeanService：SpringBeanService bean 实例创建成功了
        System.out.println("SpringBeanService：" + applicationContext.getBean(SpringBeanService.class));
    }

}
