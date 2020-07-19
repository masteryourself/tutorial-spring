package pers.masteryourself.tutorial.spring.cloud.consumer.zuul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>description : ConsumerController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/19 12:28
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/info")
    public Map<String, String> info() {
        Map<String, String> result = new HashMap<>(10);
        result.put("code", "200");
        result.put("port", serverPort);
        return result;
    }

    @RequestMapping("/header")
    public Map<String, String> header(HttpServletRequest request) {
        Map<String, String> result = new HashMap<>(10);
        result.put("Set-cookie", request.getHeader("Set-cookie"));
        result.put("Cookie", request.getHeader("Cookie"));
        return result;
    }

}
