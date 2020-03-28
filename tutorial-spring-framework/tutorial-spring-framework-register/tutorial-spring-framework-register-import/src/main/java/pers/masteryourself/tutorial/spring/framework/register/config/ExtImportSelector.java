package pers.masteryourself.tutorial.spring.framework.register.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p>description : ExtImportSelector
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/28 21:09
 */
public class ExtImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"pers.masteryourself.tutorial.spring.framework.register.bean.Dog"};
    }

}
