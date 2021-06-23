package pers.masteryourself.tutorial.spring.framework.extension.aware.importware;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * <p>description : MyImportAware
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/21 17:29
 */
@Configuration
public class ImportAwareConfiguration implements ImportAware {

    @Override
    public void setImportMetadata(AnnotationMetadata annotationMetadata) {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setImportMetadata"));
        Map<String, Object> attributes = annotationMetadata.getAnnotationAttributes(EnableMasterYourself.class.getName());
        System.out.println("获取注解信息：" + attributes);
    }

}
