package pers.masteryourself.tutorial.spring.framework.injection.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>description : Person
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/5 22:17
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@ToString
public class Person {

    /**
     * 会带来因为作用域范围引出的问题
     */
    @Autowired
    private Dog dog;

    /**
     * 使用 {@link Lookup} 避免原型问题
     *
     * @return
     */
    @Lookup
    public Dog dog() {
        return null;
    }

    public void doSomething() {
        System.out.println("使用 @Autowired：" + dog.hashCode());
        System.out.println("使用 @Lookup：" + dog().hashCode());
    }

}
