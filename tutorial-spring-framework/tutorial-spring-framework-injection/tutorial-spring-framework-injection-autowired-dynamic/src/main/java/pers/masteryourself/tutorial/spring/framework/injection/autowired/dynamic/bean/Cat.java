package pers.masteryourself.tutorial.spring.framework.injection.autowired.dynamic.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

/**
 * <p>description : Cat
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/20 0:21
 */
@Component
@ConditionalOnMissingBean(Animal.class)
public class Cat implements Animal {
}
