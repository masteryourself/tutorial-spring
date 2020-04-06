package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.context.annotation.Import;
import pers.masteryourself.tutorial.spring.framework.register.bean.Cat;

/**
 * <p>description : SpringConfig
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:09
 */
@Import({Cat.class, ExtImportSelector.class, ExtImportBeanDefinitionRegistrar.class})
public class SpringConfig {
}
