package pers.masteryourself.tutorial.spring.framework.injection.autowired.required;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.required.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.required.service.AnimalService;

/**
 * <p>description : AutowiredDynamicApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/20 11:06
 */
public class AutowiredRequiredApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AnimalService animalService = context.getBean(AnimalService.class);
        System.out.println(animalService.getDog());
        System.out.println(animalService.getCat());
    }

}
