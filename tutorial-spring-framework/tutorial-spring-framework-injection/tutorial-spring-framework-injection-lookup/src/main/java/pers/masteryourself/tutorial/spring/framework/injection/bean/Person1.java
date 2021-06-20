package pers.masteryourself.tutorial.spring.framework.injection.bean;

import lombok.ToString;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>description : Person1
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/20 18:17
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@ToString
public class Person1 {

    @Resource
    private Dog dog;

    public void adoptDog() {
        System.out.println("领养了一直狗: " + dog);
    }

}
