package pers.masteryourself.tutorial.spring.cloud.consumer.feign.hystrix.fallback.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.masteryourself.tutorial.spring.cloud.consumer.feign.hystrix.fallback.feign.ProviderFeign;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>description : ProviderFeignFallback
 * <p>注意该类上要添加 @RequestMapping 注解
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/18 14:04
 */
@Component
@RequestMapping("/fallback/provider")
public class ProviderFeignFallback implements ProviderFeign {

    @Override
    public Map<String, String> info() {
        Map<String, String>  result = new HashMap<>(10);
        result.put("code", "100");
        result.put("msg", "前方拥堵");
        return result;
    }

}
