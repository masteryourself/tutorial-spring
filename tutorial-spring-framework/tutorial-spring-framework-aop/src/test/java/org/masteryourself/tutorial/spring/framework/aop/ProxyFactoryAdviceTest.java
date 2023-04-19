package org.masteryourself.tutorial.spring.framework.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * <p>description : ProxyFactoryAdviceTest
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2023/4/18 19:48
 */
public class ProxyFactoryAdviceTest {

    @Test
    public void testProxyFactoryAdvice() {
        // 1. 创建代理工厂类 ProxyFactory
        ProxyFactory proxyFactory = new ProxyFactory();
        // 2. 设置目标对象
        proxyFactory.setTarget(new IBean.BeanImpl());
        // 3. 添加环绕通知
        // 这里虽然调用的是 addAdvice() 方法，但最终也是调用 addAdvisor() 添加切面，并且 Pointcut 为 true（表示全部匹配）
        proxyFactory.addAdvice(new MethodInterceptor() {
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
        });
        // 4. 添加接口, 使其默认使用 jdk 代理
        // 如果想强制使用 cglib 动态代理, 可以通过 proxyFactory.setProxyTargetClass(true) 属性设置
        proxyFactory.addInterface(IBean.class);
        // 5. 创建代理对象
        IBean proxy = (IBean) proxyFactory.getProxy();
        // class com.sun.proxy.$Proxy4
        System.out.println(proxy.getClass());
        // before...
        proxy.foo();
        // after...
        // before...
        proxy.bar();
        // after...
    }

}
