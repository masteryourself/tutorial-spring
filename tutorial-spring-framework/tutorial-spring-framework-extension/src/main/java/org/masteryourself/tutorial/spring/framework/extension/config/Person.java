package org.masteryourself.tutorial.spring.framework.extension.config;

import lombok.ToString;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>description : Person
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/13 4:28 PM
 */
@ToString
@Component
public class Person implements InitializingBean {

    public String name;

    /**
     * 构造方法
     */
    public Person() {
        System.out.println("Person constructor");
    }

    /**
     * 属性赋值操作
     *
     * @param name
     */
    @Value("${os.name}")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 初始化方法
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person afterPropertiesSet");
    }
}
