package pers.masteryourself.tutorial.spring.cloud.consumer.feign.fallback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.masteryourself.tutorial.spring.cloud.consumer.feign.fallback.feign.ProviderFeign;

import java.util.Map;

/**
 * <p>description : ConsumerController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/18 13:36
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ProviderFeign feign;

    @RequestMapping("/info")
    public Map<String, String> info() {
        return feign.info();
    }

}
