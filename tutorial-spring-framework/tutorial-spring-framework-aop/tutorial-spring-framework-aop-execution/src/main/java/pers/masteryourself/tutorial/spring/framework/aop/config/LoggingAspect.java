package pers.masteryourself.tutorial.spring.framework.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

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

    @Pointcut("execution(* pers.masteryourself.tutorial.spring.framework.aop.service.impl.PersonServiceImpl.*(..))")
    public void declareJointPointExpression() {
    }

    @Around("declareJointPointExpression()")
    public Object aroundMethod(ProceedingJoinPoint pjd) {
        Object result = null;
        try {
            //前置通知
            System.out.println("前置通知");
            //执行目标方法
            result = pjd.proceed();
            //返回通知
            System.out.println("返回通知");
        } catch (Throwable e) {
            //异常通知
            System.out.println("异常通知" + e);
            throw new RuntimeException(e);
        }
        //后置通知
        System.out.println("后置通知");
        return result;
    }

}
