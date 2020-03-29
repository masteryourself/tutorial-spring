package pers.masteryourself.tutorial.spring.framework.postprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.postprocessor.config.SpringConfig;

/**
 * <p>description : ExtensionApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 22:12
 */
public class ExtensionApplication {

    public static void main(String[] args) {
        // >>>>>>>>>>>>>>>> {MyBeanDefinitionRegistryPostProcessor} postProcessBeanDefinitionRegistry 执行了
        //>>>>>>>>>>>>>>>> {MyBeanDefinitionRegistryPostProcessor} bean 的数量 10
        //>>>>>>>>>>>>>>>> {MyBeanDefinitionRegistryPostProcessor} postProcessBeanFactory 执行了
        //>>>>>>>>>>>>>>>> {MyBeanDefinitionRegistryPostProcessor} bean 的数量 11
        //================ {MyBeanFactoryPostProcessor} postProcessBeanFactory 执行了
        //================ {MyBeanFactoryPostProcessor} bean 的数量是 11
        //person 构造函数执行了
        //**************** {MyBeanPostProcessor} postProcessBeforeInitialization 执行了
        //**************** {MyBeanPostProcessor} postProcessAfterInitialization 执行了
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.close();
    }

}
