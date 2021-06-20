package pers.masteryourself.tutorial.spring.framework.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.bean.Dog;
import pers.masteryourself.tutorial.spring.framework.injection.bean.Person1;
import pers.masteryourself.tutorial.spring.framework.injection.bean.Person3;
import pers.masteryourself.tutorial.spring.framework.injection.config.SpringConfig;

/**
 * <p>description : LookupApplication
 * <p>{@link Person1} 的 scope 是 singleton 的，{@link Dog} 的 scope 是 prototype 的，在 {@link Person1} 中使用 {@link Dog} 就会出现因为作用域范围带来的问题
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/5 22:17
 */
public class LookupApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Person3 person = applicationContext.getBean(Person3.class);
        person.adoptDog();
        person.adoptDog();
    }

}
