//package org.masteryourself.tutorial.spring.framework.mvc.isolation;
//
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
///**
// * <p>description : WebIsolationApplication
// * 父子隔离容器
// *
// * <p>blog : https://www.yuque.com/ruanrenzhao/
// *
// * @author : masteryourself
// * @version : 1.0.0
// * @date : 2022/3/16 11:07 AM
// */
//public class WebIsolationApplication extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//    /**
//     * 配置 Spring 父容器
//     *
//     * @return
//     */
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[]{SpringConfig.class};
//    }
//
//    /**
//     * 配置 Spring 子容器 (mvc 容器)
//     *
//     * @return
//     */
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class[]{SpringMvcConfig.class};
//    }
//
//    /**
//     * 配置 servlet 容器的映射路径
//     *
//     * @return
//     */
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//}
