package pers.masteryourself.tutorial.spring.framework.extension.aware.importware;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p>description : EnableMasterYourself
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
@Import(ImportAwareConfiguration.class)
public @interface EnableMasterYourself {

    String name() default "五分钟聊架构";

}
