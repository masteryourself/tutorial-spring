package pers.masteryourself.tutorial.spring.boot.starter.sample;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>description : SampleProperties
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/21 21:11
 */
@Data
@ConfigurationProperties(prefix = "sample")
public class SampleProperties {

    private String prefix;

    private String suffix;

}
