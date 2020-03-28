package pers.masteryourself.tutorial.spring.framework.register;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.register.bean.Animal;
import pers.masteryourself.tutorial.spring.framework.register.config.SpringConfig;

import java.util.Map;

/**
 * <p>description : ConditionalApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 20:59
 */
public class ConditionalApplication {

    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Map<String, Animal> beansOfType = context.getBeansOfType(Animal.class);
        // Animal{name='蝙蝠'}
        beansOfType.forEach((name,animal) -> System.out.println(animal));
    }

}
