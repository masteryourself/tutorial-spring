package pers.masteryourself.tutorial.spring.framework.extension._import.integration;

import pers.masteryourself.tutorial.spring.framework.extension._import.entity.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * <p>description : SqlInvocationHandler
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2021/6/23 14:06
 */
public class SqlInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
        }
        // 获取注解
        if (!method.isAnnotationPresent(Select.class)) {
            return method.invoke(this, args);
        }
        Select select = method.getAnnotation(Select.class);
        if (select == null) {
            return method.invoke(this, args);
        }
        // 1. 获取 sql 2. 执行 sql 3. 封装结果集
        String sql = select.value();
        System.out.println("执行了 sql: [" + sql + "]");
        return Arrays.asList(new User(1L, "张三"), new User(2L, "李四"));
    }

}
