package org.masteryourself.tutorial.spring.framework.aop;

/**
 * <p>description : IBean
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2023/4/18 19:47
 */
public interface IBean {

    void foo();

    void bar();

    class BeanImpl implements IBean {
        public void foo() {
            System.out.println("foo");
        }

        public void bar() {
            System.out.println("bar");
        }
    }
}
