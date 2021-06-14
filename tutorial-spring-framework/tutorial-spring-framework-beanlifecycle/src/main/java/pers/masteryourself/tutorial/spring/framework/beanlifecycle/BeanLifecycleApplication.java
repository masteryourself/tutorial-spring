package pers.masteryourself.tutorial.spring.framework.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.beanlifecycle.config.SpringConfig;

/**
 * <p>description : BeanLifecycleApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:47
 */
public class BeanLifecycleApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 关闭容器，调用此方法才会销毁对象
        context.close();
        //  monitor constructor
        //  monitor =================>>>>>>>>>>>>> postProcessBeforeInitialization
        //  monitor postConstruct
        //  monitor afterPropertiesSet
        //  monitor initMethod
        //  monitor =================>>>>>>>>>>>>> postProcessAfterInitialization
        //  monitor preDestroy
        //  monitor destroy
        //  monitor destroyMethod
    }

}
