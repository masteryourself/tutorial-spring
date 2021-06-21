package pers.masteryourself.tutorial.spring.framework.extension.aware.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import pers.masteryourself.tutorial.spring.framework.extension.aware.importware.ImportAwareConfiguration;

/**
 * <p>description : MyApplicationContextAware
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/21 17:34
 */
@Component
public class MyApplicationContextAware implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setApplicationContext"));
        System.out.println("容器中获取 ImportAwareConfiguration 对象: " + applicationContext.getBean(ImportAwareConfiguration.class));
    }

}
