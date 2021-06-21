package pers.masteryourself.tutorial.spring.framework.extension.aware.config;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * <p>description : MyEmbeddedValueResolverAware
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/21 17:34
 */
@Component
public class MyEmbeddedValueResolverAware implements EmbeddedValueResolverAware {

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println(String.format("{%s} ==========================>>>>>>>>>>>>>>>>>>>>>>>>>>>", "setEmbeddedValueResolver"));
        System.out.println("解析 {os.name} : " + resolver.resolveStringValue("my os is [${os.name}]"));
    }

}
