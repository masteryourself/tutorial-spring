package pers.masteryourself.tutorial.spring.framework.register.bean;

/**
 * <p>description : Person
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/27 23:15
 */
public class Person {

    public void init() {
        System.out.println("person 初始化");
    }

    public void destroy() {
        System.out.println("person 销毁");
    }

}
