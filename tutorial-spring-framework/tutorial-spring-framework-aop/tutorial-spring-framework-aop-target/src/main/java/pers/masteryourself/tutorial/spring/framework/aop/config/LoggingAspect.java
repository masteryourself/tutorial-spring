package pers.masteryourself.tutorial.spring.framework.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pers.masteryourself.tutorial.spring.framework.aop.service.impl.PersonServiceImpl;

/**
 * <p>description : LoggingAspect
 *
 * <p>blog : https://blog.csdn.net/masteryourself
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
     * target 表示目标对象的匹配类型是否是 {@link PersonServiceImpl}，目标对象类型永远不会发生变化
     * 因为要代理的对象就是 {@link PersonServiceImpl}，所以肯定是
     */
    @Pointcut("target(pers.masteryourself.tutorial.spring.framework.aop.service.PersonService)")
    public void declareJointPointExpression() {
    }

    @Before("declareJointPointExpression()")
    public void before() {
        System.out.println("aop 生效");
    }

}
