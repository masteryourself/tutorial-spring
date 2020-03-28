package pers.masteryourself.tutorial.spring.framework.property.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * <p>description : Person
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 23:16
 */
@Data
public class Person {

    @Value("#{001+001}")
    private Long id;

    @Value("zs")
    private String name;

    @Value("${person.address}")
    private String address;

    @Value("${person.age:19}")
    private Integer age;

}
