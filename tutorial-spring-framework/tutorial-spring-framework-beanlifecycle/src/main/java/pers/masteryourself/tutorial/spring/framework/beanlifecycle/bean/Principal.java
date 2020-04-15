package pers.masteryourself.tutorial.spring.framework.beanlifecycle.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <p>description : Principal
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:50
 */
@Component
public class Principal {

    public Principal() {
        System.out.println("principal constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("principal postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("principal preDestroy");
    }

}