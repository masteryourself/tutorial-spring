package pers.masteryourself.tutorial.spring.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * <p>description : ProviderController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/5/30 13:56
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "info")
    public Map<String, String> info() {
        try {
            // 模拟超时
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map<String, String> result = new HashMap<>(10);
        result.put("code", "200");
        result.put("serverPort", serverPort);
        return result;
    }

}
