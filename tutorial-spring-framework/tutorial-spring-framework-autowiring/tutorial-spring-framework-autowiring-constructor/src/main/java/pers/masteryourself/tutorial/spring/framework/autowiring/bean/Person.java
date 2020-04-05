package pers.masteryourself.tutorial.spring.framework.autowiring.bean;

import lombok.ToString;

/**
 * <p>description : Person
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/5 2:39
 */
@ToString
public class Person {

    private Dog dog;

    /**
     * constructor 会根据构造函数中的入参查找容器中是否有对应的 bean
     * 先根据类型查找，如果有多个类型的 bean，再根据 beanName 获取，如下是获取 beanName=dog2 的 bean
     *
     * @param dog2
     */
    public Person(Dog dog2) {
        this.dog = dog2;
    }

}
