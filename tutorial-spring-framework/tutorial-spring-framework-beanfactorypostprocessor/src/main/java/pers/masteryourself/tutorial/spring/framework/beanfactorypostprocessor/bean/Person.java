package pers.masteryourself.tutorial.spring.framework.beanfactorypostprocessor.bean;

import org.springframework.stereotype.Component;

/**
 * <p>description : Person
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 22:13
 */
@Component
public class Person {

    public Person() {
        System.out.println("person 构造函数执行了");
    }

}
