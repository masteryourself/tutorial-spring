package pers.masteryourself.tutorial.spring.framework.extension._import.integration;

import java.lang.annotation.*;

/**
 * <p>description : Select
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/23 14:02
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Select {

    String value();

}
