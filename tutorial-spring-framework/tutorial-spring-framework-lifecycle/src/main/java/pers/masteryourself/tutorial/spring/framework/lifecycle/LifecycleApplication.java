package pers.masteryourself.tutorial.spring.framework.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.lifecycle.config.SpringConfig;

/**
 * <p>description : LifecycleApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:47
 */
public class LifecycleApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 关闭容器，调用此方法才会销毁对象
        context.close();
        // student constructor
        // student =================>>>>>>>>>>>>> postProcessBeforeInitialization
        // student initMethod
        // student =================>>>>>>>>>>>>> postProcessAfterInitialization
        // teacher constructor
        // teacher =================>>>>>>>>>>>>> postProcessBeforeInitialization
        // teacher afterPropertiesSet
        // teacher =================>>>>>>>>>>>>> postProcessAfterInitialization
        // principal constructor
        // principal =================>>>>>>>>>>>>> postProcessBeforeInitialization
        // principal postConstruct
        // principal =================>>>>>>>>>>>>> postProcessAfterInitialization
        // principal preDestroy
        // teacher destroy
        // student destroyMethod
    }

}
