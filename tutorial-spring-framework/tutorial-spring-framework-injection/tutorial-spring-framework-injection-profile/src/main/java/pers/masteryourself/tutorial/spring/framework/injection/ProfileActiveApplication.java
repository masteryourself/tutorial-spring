package pers.masteryourself.tutorial.spring.framework.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.bean.Datasource;
import pers.masteryourself.tutorial.spring.framework.injection.config.SpringConfig;

/**
 * <p>description : ProfileApplication
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:30
 */
public class ProfileActiveApplication {

    /**
     * 通过代码激活
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        // 1. 创建一个 AnnotationConfigApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 2. 设置需要激活的环境
        context.getEnvironment().setActiveProfiles("dev", "test");
        // 3. 注册主配置类
        context.register(SpringConfig.class);
        // 4. 刷新容器
        context.refresh();
        String[] names = context.getBeanNamesForType(Datasource.class);
        for (String name : names) {
            // devDatasource
            // testDatasource
            System.out.println(name);
        }
    }

}
