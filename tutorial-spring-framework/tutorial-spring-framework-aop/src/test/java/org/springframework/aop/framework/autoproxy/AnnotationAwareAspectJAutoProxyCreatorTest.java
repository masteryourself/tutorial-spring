package org.springframework.aop.framework.autoproxy;

import org.junit.Test;
import org.masteryourself.tutorial.spring.framework.aop.AspectTest;
import org.masteryourself.tutorial.spring.framework.aop.IBean;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.support.GenericApplicationContext;

/**
 * <p>description : AnnotationAwareAspectJAutoProxyCreatorTest
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2023/4/19 11:54
 */
public class AnnotationAwareAspectJAutoProxyCreatorTest {

    @Test
    public void testAnnotationAwareAspectJAutoProxyCreator() {
        GenericApplicationContext context = new GenericApplicationContext();
//        context.registerBean("aspect1", AspectTest.Aspect1.class);
//        context.registerBean("aspect2", AspectTest.Aspect2.class);
//        context.registerBean(AnnotationAwareAspectJAutoProxyCreator.class);
//        context.registerBean("beanImpl", IBean.BeanImpl.class);
//        context.refresh();
//        AnnotationAwareAspectJAutoProxyCreator creator = context.getBean(AnnotationAwareAspectJAutoProxyCreator.class);
//        Object aspect1 = creator.wrapIfNecessary(new AspectTest.Aspect1(), "aspect1", "");
//        System.out.println(aspect1.getClass());
//        Object beanImpl = creator.wrapIfNecessary(new IBean.BeanImpl(), "beanImpl", "");
//        System.out.println(beanImpl.getClass());
        context.registerBean("aspect1", AspectTest.Aspect1.class);
        context.registerBean("aspect2", AspectTest.Aspect2.class);
        context.registerBean(AnnotationAwareAspectJAutoProxyCreator.class);
        context.registerBean("beanImpl", IBean.BeanImpl.class);
        context.refresh();
        IBean beanImpl = context.getBean("beanImpl", IBean.class);
        System.out.println(beanImpl.getClass());
    }

}
