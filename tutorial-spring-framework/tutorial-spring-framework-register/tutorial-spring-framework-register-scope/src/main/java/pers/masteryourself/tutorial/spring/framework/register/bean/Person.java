package pers.masteryourself.tutorial.spring.framework.register.bean;

/**
 * <p>description : Person
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 20:52
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println(String.format("【%s】 用户创建成功", name));
    }

}
