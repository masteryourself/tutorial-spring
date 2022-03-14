package org.masteryourself.tutorial.spring.framework.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * <p>description : LoggingAspect
 *
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
     * 匹配 org.masteryourself.tutorial.spring.framework.aop.service 包及其子包中的任意以 save 开头的方法
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
    @Pointcut("execution(* org.masteryourself.tutorial.spring.framework.aop.service..*.save*(..))")
    public void declareJointPointExpression() {
    }

    @Before("declareJointPointExpression()")
    public void before() {
        System.out.println("aop 生效");
    }

}

