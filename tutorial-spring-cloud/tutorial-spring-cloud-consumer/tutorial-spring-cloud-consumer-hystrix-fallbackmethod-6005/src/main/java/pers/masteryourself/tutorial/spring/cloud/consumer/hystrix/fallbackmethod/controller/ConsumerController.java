package pers.masteryourself.tutorial.spring.cloud.consumer.hystrix.fallbackmethod.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>description : ConsumerController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/18 13:39
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @RequestMapping("/info")
    @HystrixCommand(fallbackMethod = "infoFallback")
    public Map<String, String> info(String id) {
        throw new RuntimeException("故意报错了：" + id);
    }

    public Map<String, String> infoFallback(String id) {
        Map<String, String> result = new HashMap<>(10);
        result.put("id", id);
        result.put("message", "方法降级了");
        return result;
    }

}
