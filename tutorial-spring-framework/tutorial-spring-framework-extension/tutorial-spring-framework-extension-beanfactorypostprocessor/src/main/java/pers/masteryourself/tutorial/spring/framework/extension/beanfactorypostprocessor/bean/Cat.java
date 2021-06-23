package pers.masteryourself.tutorial.spring.framework.extension.beanfactorypostprocessor.bean;

import lombok.Data;

/**
 * <p>description : Cat
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/22 16:10
 */
@Data
public class Cat {

    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }
}
