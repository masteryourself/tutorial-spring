package pers.masteryourself.tutorial.spring.framework.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

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
     * 匹配 pers.masteryourself.tutorial.spring.framework.aop.service 包及其子包中的任意方法
     * within(pers.masteryourself.tutorial.spring.framework.aop.service.*) 表示匹配 pers.masteryourself.tutorial.spring.framework.aop.service 包中的任意方法
     */
    @Pointcut("within(pers.masteryourself.tutorial.spring.framework.aop.service..*)")
    public void declareJointPointExpression() {
    }

    @Before("declareJointPointExpression()")
    public void before() {
        System.out.println("aop 生效");
    }

}
