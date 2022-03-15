package org.masteryourself.tutorial.spring.framework.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * <p>description : LoggingAspect
 * 正常：前置通知===目标方法===返回通知===后置通知
 * 异常: 前置通知===目标方法===异常通知===后置通知
 * try {
 * 前置通知
 * 目标方法的执行
 * 返回通知
 * } catch() {
 * 异常通知
 * } finally {
 * 后置通知
 * }
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/3/14 7:30 PM
 */
@Aspect
@Component
@Order(1)
public class LoggingAspect {

    /**
     * execution(* org.masteryourself.dao.*.*(..)) 表示匹配 org.masteryourself.dao 包下的任意接口和类的任意方法
     * execution(public * org.masteryourself.dao.*.*(..)) 表示匹配 org.masteryourself.dao 包下的任意接口和类的 public 方法
     * execution(public * org.masteryourself.dao.*.*()) 表示匹配 org.masteryourself.dao 包下的任意接口和类的 public 无方法参数的方法
     * execution(* org.masteryourself.dao.*.*(java.lang.String, ..)) 表示匹配 org.masteryourself.dao 包下的任意接口和类的第一个参数为 String 类型的方法
     * execution(* org.masteryourself.dao.*.*(java.lang.String)) 表示匹配 org.masteryourself.dao 包下的任意接口和类的只有一个参数，且参数为 String 类型的方法
     * execution(public * *(..)) 表示匹配任意的 public 方法
     * execution(* save*(..)) 表示匹配任意的以 save 开头的方法
     * execution(* org.masteryourself.dao.IndexDao.*(..)) 表示匹配 org.masteryourself.dao.IndexDao 接口中任意的方法
     * execution(* org.masteryourself.dao..*.*(..)) 表示匹配 org.masteryourself.dao 包及其子包中任意的方法
     */
    // 前置通知
    @Before("execution(* org.masteryourself.tutorial.spring.framework.aop.service.*.*(..))")
    public void logStart(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("前置通知 ==>" + name + "....【args: " + Arrays.asList(joinPoint.getArgs()) + "】");
    }

    // 返回通知
    @AfterReturning(value = "execution(* org.masteryourself.tutorial.spring.framework.aop.service.*.*(..))", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println("返回通知 ==>" + name + "....【args: " + Arrays.asList(joinPoint.getArgs()) + "】【result: " + result + "】");
    }


    // 后置通知
    @After("execution(* org.masteryourself.tutorial.spring.framework.aop.service.*.*(..))")
    public void logEnd(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("后置通知 ==>" + name + "....【args: " + Arrays.asList(joinPoint.getArgs()) + "】");
    }


    // 异常通知
    @AfterThrowing(value = "execution(* org.masteryourself.tutorial.spring.framework.aop.service.*.*(..))", throwing = "e")
    public void logError(JoinPoint joinPoint, Exception e) {
        String name = joinPoint.getSignature().getName();
        System.out.println("异常通知 ==>" + name + "....【args: " + Arrays.asList(joinPoint.getArgs()) + "】【exception: " + e + "】");
    }

}

