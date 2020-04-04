package pers.masteryourself.tutorial.spring.framework.servlet3;

import pers.masteryourself.tutorial.spring.framework.servlet3.config.ServletInitializer;
import pers.masteryourself.tutorial.spring.framework.servlet3.web.MyFilter;
import pers.masteryourself.tutorial.spring.framework.servlet3.web.MyHttpServlet;
import pers.masteryourself.tutorial.spring.framework.servlet3.web.MyServletContextListener;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * <p>description : MyServletContainerInitializer
 * <p>{@link HandlesTypes} 会在容器启动时，将 {@link ServletInitializer} 类型的类传入到 set 集合中
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/4 16:31
 */
@HandlesTypes(ServletInitializer.class)
public class MyServletContainerInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        // 打印 @HandlesTypes 传入的类
        for (Class<?> clazz : set) {
            System.out.println("@HandlesTypes 传入的类有：" + clazz.getName());
        }
        // 注册组件
        servletContext.addServlet("MyHttpServlet", MyHttpServlet.class)
                .addMapping("/servlet3");
        servletContext.addListener(MyServletContextListener.class);
        servletContext.addFilter("MyFilter", MyFilter.class)
                .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");

    }

}
