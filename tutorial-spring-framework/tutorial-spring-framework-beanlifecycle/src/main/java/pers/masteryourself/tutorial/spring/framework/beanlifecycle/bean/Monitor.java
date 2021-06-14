package pers.masteryourself.tutorial.spring.framework.beanlifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <p>description : Monitor
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/14 16:45
 */
public class Monitor implements InitializingBean, DisposableBean {

    public Monitor() {
        System.out.println("monitor constructor");
    }

    public void initMethod() {
        System.out.println("monitor initMethod");
    }

    public void destroyMethod() {
        System.out.println("monitor destroyMethod");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("monitor postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("monitor preDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("monitor afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("monitor destroy");
    }

}
