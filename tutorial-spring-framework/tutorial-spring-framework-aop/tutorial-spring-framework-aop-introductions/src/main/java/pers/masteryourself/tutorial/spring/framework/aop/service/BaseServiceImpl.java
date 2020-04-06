package pers.masteryourself.tutorial.spring.framework.aop.service;

/**
 * <p>description : BaseServiceImpl
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/6 12:55
 */
public class BaseServiceImpl implements BaseService{

    @Override
    public void query(String name) {
        System.out.println("执行 query()");
    }

    @Override
    public void save(String name) {
        System.out.println("执行 save()");
    }

}
