package pers.masteryourself.tutorial.spring.cloud.consumer.feign.fallbackfactory.fallback;

import org.springframework.stereotype.Component;
import pers.masteryourself.tutorial.spring.cloud.consumer.feign.fallbackfactory.feign.ProviderFeign;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>description : ProviderFeignFallback
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/18 14:04
 */
@Component
public class ProviderFeignFallbackFactory implements ProviderFeign {

    @Override
    public Map<String, String> info() {
        Map<String, String> result = new HashMap<>(16);
        result.put("code", "100");
        result.put("msg", "前方拥堵");
        return result;
    }

}
