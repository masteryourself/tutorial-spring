package pers.masteryourself.tutorial.spring.boot.starter.sample;

/**
 * <p>description : SampleService
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/21 21:10
 */
public class SampleService {

    private SampleProperties properties;

    public SampleService(SampleProperties properties) {
        this.properties = properties;
    }

    public String say(String str) {
        return properties.getPrefix() + " [" + str + "] " + properties.getSuffix();
    }

}
