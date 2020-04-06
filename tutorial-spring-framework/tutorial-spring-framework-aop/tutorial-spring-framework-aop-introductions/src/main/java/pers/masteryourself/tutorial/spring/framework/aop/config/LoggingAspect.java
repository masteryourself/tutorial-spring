package pers.masteryourself.tutorial.spring.framework.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pers.masteryourself.tutorial.spring.framework.aop.service.BaseService;
import pers.masteryourself.tutorial.spring.framework.aop.service.BaseServiceImpl;

/**
 * <p>description : LoggingAspect
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 0:30
 */
@Aspect
@Component
@Order(1)
public class LoggingAspect {

    /**
     * 让 pers.masteryourself.tutorial.spring.framework.aop.service 下面的类都实现 {@link BaseService}接口，默认使用的 {@link BaseServiceImpl}作为实现
     */
    @DeclareParents(value = "pers.masteryourself.tutorial.spring.framework.aop.service.*", defaultImpl = BaseServiceImpl.class)
    public static BaseService baseService;

}
