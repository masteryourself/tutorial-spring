package org.masteryourself.tutorial.spring.framework.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.support.GenericApplicationContext;

/**
 * <p>description : AspectTest
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2023/4/19 11:01
 */
public class AspectTest {

    @Test
    public void testAspect() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("aspect1", Aspect1.class);
        context.registerBean("aspect2", Aspect2.class);
        context.registerBean(AnnotationAwareAspectJAutoProxyCreator.class);
        context.registerBean("beanImpl", IBean.BeanImpl.class);
        context.refresh();
        IBean beanImpl = context.getBean("beanImpl", IBean.class);
        // Aspect1.around()...
        // Aspect2.before()...
        beanImpl.foo();
        // Aspect2.after()...
        beanImpl.bar();
    }

    @Aspect
    public static class Aspect1 {

        @Around("execution(* foo())")   // 最终它会转换成一个 advisor 切面
        public Object around(ProceedingJoinPoint pjp) throws Throwable {
            System.out.println("Aspect1.around()...");
            return pjp.proceed();
        }

    }

    @Aspect
    public static class Aspect2 {

        @Before("execution(* foo())")   // 最终它会转换成一个 advisor 切面
        public void before() throws Throwable {
            System.out.println("Aspect2.before()...");
        }

        @After("execution(* foo())")    // 最终它会转换成一个 advisor 切面
        public void after() throws Throwable {
            System.out.println("Aspect2.after()...");
        }

    }

}
