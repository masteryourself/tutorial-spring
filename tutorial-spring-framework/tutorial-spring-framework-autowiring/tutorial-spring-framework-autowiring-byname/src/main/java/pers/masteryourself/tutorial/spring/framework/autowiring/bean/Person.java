package pers.masteryourself.tutorial.spring.framework.autowiring.bean;

import lombok.ToString;

/**
 * <p>description : Person
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/5 2:39
 */
@ToString
public class Person {

    private Dog dog2;

    /**
     * byName 会根据 setDog1() 方法的名字注入 bean，即 [dog1]，和属性名字 [dog2] 无关系
     * 如果方法名称改为 setDog()，因为容器中存在 Dog 的 beanName 是 [dog1] 和 [dog2]，所以将会注入 null
     *
     * @param dog
     */
    public void setDog1(Dog dog) {
        this.dog2 = dog;
    }

}
