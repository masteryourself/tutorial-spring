package pers.masteryourself.tutorial.spring.cloud.consumer.feign.hystrix.fallback.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.masteryourself.tutorial.spring.cloud.consumer.feign.hystrix.fallback.fallback.ProviderFeignFallback;

import java.util.Map;

/**
 * <p>description : ProviderFeign
 * <p>fallback 指定服务降级类
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/18 13:38
 */
@FeignClient(value = "tutorial-spring-cloud-provider-eureka", fallback = ProviderFeignFallback.class)
@RequestMapping("/provider")
public interface ProviderFeign {

    @RequestMapping("/info")
    Map<String, String> info();
}
