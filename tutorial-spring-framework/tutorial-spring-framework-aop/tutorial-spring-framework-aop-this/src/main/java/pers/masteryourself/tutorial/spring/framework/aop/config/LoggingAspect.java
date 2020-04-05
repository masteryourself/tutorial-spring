package pers.masteryourself.tutorial.spring.framework.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pers.masteryourself.tutorial.spring.framework.aop.service.PersonService;
import pers.masteryourself.tutorial.spring.framework.aop.service.impl.PersonServiceImpl;
import pers.masteryourself.tutorial.spring.framework.aop.service.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

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
     * this 表示代理对象的匹配类型是否是 {@link PersonServiceImpl}
     * 如果是 JDK 动态代理将不会为方法代理成功，因为在 JDK 中，代理对象会实现 {@link PersonService} 继承 {@link Proxy}接口，所以不是 {@link PersonServiceImpl} 类型
     * 有两种解决方案：
     * 1. 可以通过 {@link EnableAspectJAutoProxy} 的 proxyTargetClass = true 属性强制使用 cglib 进行代理
     * 2. this(pers.masteryourself.tutorial.spring.framework.aop.service.impl.PersonServiceImpl) 换成 this(pers.masteryourself.tutorial.spring.framework.aop.service.PersonService)
     */
    @Pointcut("this(pers.masteryourself.tutorial.spring.framework.aop.service.impl.PersonServiceImpl)")
    public void declareJointPointExpressionByJDK() {
    }

    /**
     * 如果是 cglib 动态代理会生效，在 cglib 中，代理对象会继承 {@link UserServiceImpl}
     */
    @Pointcut("this(pers.masteryourself.tutorial.spring.framework.aop.service.impl.UserServiceImpl)")
    public void declareJointPointExpressionByCglib() {
    }

    @Before("declareJointPointExpressionByJDK() || declareJointPointExpressionByCglib()")
    public void before() {
        System.out.println("aop 生效");
    }

}
