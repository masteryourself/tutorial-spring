package pers.masteryourself.tutorial.spring.boot.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import pers.masteryourself.tutorial.spring.boot.dubbo.service.SampleService;

/**
 * <p>description : SampleServiceImpl
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/22 14:11
 */
@Service(version = "1.0.1")
public class SampleServiceImpl implements SampleService {

    @Override
    public String say(String name) {
        return "hello, " + name;
    }

}
