package pers.masteryourself.tutorial.spring.framework.beanlifecycle.bean;

/**
 * <p>description : Student
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:49
 */
public class Student {

    public Student() {
        System.out.println("student constructor");
    }

    public void initMethod() {
        System.out.println("student initMethod");
    }

    public void destroyMethod() {
        System.out.println("student destroyMethod");
    }

}
