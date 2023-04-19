package org.masteryourself.tutorial.spring.framework.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.junit.Test;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * <p>description : ProxyFactoryAdvisorTest
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2023/4/18 19:49
 */
public class ProxyFactoryAdvisorTest {

    @Test
    public void testProxyFactoryAdvisor() {
        // 1. 创建代理工厂类 ProxyFactory
        ProxyFactory proxyFactory = new ProxyFactory();
        // 2. 设置目标对象
        proxyFactory.setTarget(new IBean.BeanImpl());
        // 3. 初始化切入点表达式
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* foo())");
        // 4. 添加 advisor
        proxyFactory.addAdvisor(new DefaultPointcutAdvisor(pointcut, new MethodInterceptor() {
            @Override
            public Object invoke(MethodInvocation invocation) throws Throwable {
                try {
                    System.out.println("before...");
                    return invocation.proceed();
                } catch (Exception e) {
                    System.out.println("exception...");
                    throw new RuntimeException(e);
                } finally {
                    System.out.println("after...");
                }
            }
        }));
        // 5. 创建代理对象, 这里不加接口默认使用 cglib 代理
        IBean.BeanImpl proxy = (IBean.BeanImpl) proxyFactory.getProxy();
        // class org.masteryourself.tutorial.spring.framework.aop.IBean$BeanImpl$$EnhancerBySpringCGLIB$$e9f27f3d
        System.out.println(proxy.getClass());
        // before...
        proxy.foo();
        // after...
        proxy.bar();
    }

}
