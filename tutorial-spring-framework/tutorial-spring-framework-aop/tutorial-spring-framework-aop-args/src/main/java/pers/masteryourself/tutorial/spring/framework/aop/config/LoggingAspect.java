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
     * args 表达式的作用是匹配指定参数类型和指定参数数量的方法，与包名和类名无关
     * 第一个入参类型必须是 {@link pers.masteryourself.tutorial.spring.framework.aop.bean.User}，之后的入参类型无规定
     */
    @Pointcut("args(pers.masteryourself.tutorial.spring.framework.aop.bean.User,..)")
    public void declareJointPointExpression() {
    }

    @Before("declareJointPointExpression()")
    public void before() {
        System.out.println("aop 生效");
    }

}
