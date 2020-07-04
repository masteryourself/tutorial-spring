package pers.masteryourself.tutorial.spring.cloud.consumer.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * <p>description : ProviderFeign
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/4 14:10
 */
@FeignClient(value = "tutorial-spring-cloud-provider-eureka")
@RequestMapping("/provider")
public interface ProviderFeign {

    @RequestMapping("/info")
    Map<String, String> info();
}
