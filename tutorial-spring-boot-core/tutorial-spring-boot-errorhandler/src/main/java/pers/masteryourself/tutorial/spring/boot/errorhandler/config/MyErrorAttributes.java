package pers.masteryourself.tutorial.spring.boot.errorhandler.config;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;


/**
 * <p>description : MyErrorAttributes
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 19:14
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    /*@Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        map.put("author", webRequest.getAttribute("author", RequestAttributes.SCOPE_REQUEST));
        return map;
    }*/

}
