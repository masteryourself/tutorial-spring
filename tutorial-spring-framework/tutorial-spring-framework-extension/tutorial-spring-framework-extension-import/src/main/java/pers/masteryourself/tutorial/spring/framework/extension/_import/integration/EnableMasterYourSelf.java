package pers.masteryourself.tutorial.spring.framework.extension._import.integration;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p>description : EnableMasterYourSelf
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/21 17:30
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MapperScannerRegistrar.class)
public @interface EnableMasterYourSelf {

    Class<?>[] mappers() default {};

}
