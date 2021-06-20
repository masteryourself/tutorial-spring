package pers.masteryourself.tutorial.spring.framework.injection.bean;

import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>description : Person3
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
public class Person3 implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void adoptDog() {
        System.out.println("领养了一直狗: " + applicationContext.getBean(Dog.class));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
