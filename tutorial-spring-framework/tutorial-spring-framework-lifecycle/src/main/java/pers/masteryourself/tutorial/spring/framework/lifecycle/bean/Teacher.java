package pers.masteryourself.tutorial.spring.framework.lifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * <p>description : Teacher
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:50
 */
public class Teacher implements InitializingBean, DisposableBean {

    public Teacher() {
        System.out.println("teacher constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("teacher afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("teacher destroy");
    }

}
