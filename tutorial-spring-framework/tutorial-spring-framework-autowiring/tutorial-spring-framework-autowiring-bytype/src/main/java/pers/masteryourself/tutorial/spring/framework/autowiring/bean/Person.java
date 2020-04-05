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
     * byType 会从容器中查找 setDog() 方法中的入参类型的 bean，不能有多个类型的 bean
     *
     * @param dog
     */
    public void setDog(Dog dog) {
        this.dog = dog;
    }

}
