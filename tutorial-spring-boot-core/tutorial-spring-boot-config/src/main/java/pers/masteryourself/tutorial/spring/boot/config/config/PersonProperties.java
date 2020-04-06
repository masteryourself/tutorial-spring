package pers.masteryourself.tutorial.spring.boot.config.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>description : Person
 * <P>{@link ConfigurationProperties}：告诉 SpringBoot 将本类中的所有属性和配置文件中相关的配置进行绑定, prefix 表示配置文件中的前缀
 * <P>只有这个组件是容器中的组件，才能容器提供的 @ConfigurationProperties 功能, 所以这里要么使用 @Component,
 * 要么使用 @EnableConfigurationProperties(PersonProperties.class) 开启
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/13 21:21
 */
@Data
@ConfigurationProperties(prefix = "person")
// @Component
public class PersonProperties {

    private String lastName;

    private Integer age;

    private Boolean boss;

    private Date birth;

    private Map<String, Object> maps;

    private List<Object> lists;

    private DogProperties dog;

}
