package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.beans.factory.FactoryBean;
import pers.masteryourself.tutorial.spring.framework.register.bean.Person;

/**
 * <p>description : PersonFactoryBean
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:33
 */
public class PersonFactoryBean implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        System.out.println("调用了 PersonFactoryBean.getObject() 方法");
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
