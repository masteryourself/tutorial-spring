package pers.masteryourself.tutorial.spring.framework.extension._import.integration;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * <p>description : SqlProxyBean
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/23 12:12
 */
public class SqlProxyBean<T> implements FactoryBean<T> {

    /**
     * 传入的接口类型
     */
    private final Class<T> beanInterface;

    public SqlProxyBean(Class<T> beanInterface) {
        this.beanInterface = beanInterface;
    }

    @Override
    @SuppressWarnings("all")
    public T getObject() throws Exception {
        return (T) Proxy.newProxyInstance(beanInterface.getClassLoader(), new Class[]{beanInterface}, new SqlInvocationHandler());
    }

    @Override
    public Class<?> getObjectType() {
        return beanInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
