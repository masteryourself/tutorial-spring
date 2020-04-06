package pers.masteryourself.tutorial.spring.framework.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.injection.bean.Datasource;
import pers.masteryourself.tutorial.spring.framework.injection.config.SpringConfig;

/**
 * <p>description : ProfileApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/29 2:30
 */
public class ProfileApplication {

    /**
     * 在 VM options 中配置 -Dspring.profiles.active=dev,test
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] names = context.getBeanNamesForType(Datasource.class);
        for (String name : names) {
            // devDatasource
            // testDatasource
            System.out.println(name);
        }
    }

}
