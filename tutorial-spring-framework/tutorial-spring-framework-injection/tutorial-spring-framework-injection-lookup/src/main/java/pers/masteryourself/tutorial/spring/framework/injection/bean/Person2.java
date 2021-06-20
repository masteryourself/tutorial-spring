package pers.masteryourself.tutorial.spring.framework.injection.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>description : Person2
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
public class Person2 {

    @Lookup
    public Dog dog() {
        return null;
    }

    public void adoptDog() {
        System.out.println("领养了一直狗: " + dog());
    }

}
