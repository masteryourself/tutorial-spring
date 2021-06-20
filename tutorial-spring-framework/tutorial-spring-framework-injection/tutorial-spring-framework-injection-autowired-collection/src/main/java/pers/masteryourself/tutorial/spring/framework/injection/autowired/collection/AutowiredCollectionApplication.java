package pers.masteryourself.tutorial.spring.framework.injection.autowired.collection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.collection.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.injection.autowired.collection.service.AnimalService;

/**
 * <p>description : AutowiredMultiApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/20 0:18
 */
public class AutowiredCollectionApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AnimalService animalService = context.getBean(AnimalService.class);
        System.out.println(animalService.getDog());
        System.out.println(animalService.getCat());
        System.out.println(animalService.getAnimalList());
        System.out.println(animalService.getAnimalMap());
    }

}
