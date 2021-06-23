package pers.masteryourself.tutorial.spring.framework.extension._import;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.masteryourself.tutorial.spring.framework.extension._import.config.SpringConfig;
import pers.masteryourself.tutorial.spring.framework.extension._import.dao.UserMapper;

/**
 * <p>description : ExtensionImportApplication
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/23 11:57
 */
public class ExtensionImportApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserMapper userMapper = context.getBean(UserMapper.class);
        System.out.println(userMapper.select());
        context.close();
    }

}
