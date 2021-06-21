package pers.masteryourself.tutorial.spring.framework.extension.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.extension.aware.config.SpringConfig;

/**
 * <p>description : ExtensionAwareApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/21 17:12
 */
public class ExtensionAwareApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.close();
    }

}
