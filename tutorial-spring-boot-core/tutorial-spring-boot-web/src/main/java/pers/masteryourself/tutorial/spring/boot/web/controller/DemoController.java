package pers.masteryourself.tutorial.spring.boot.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>description : DemoController
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 15:22
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public Map<String,String> hello(Model model) {
        Map<String, String> result = new HashMap<>();
        result.put("k1", "v1");
        return result;
    }

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @RequestHeader Map<String, String> header,
                                      @RequestParam("age") Integer age,
                                      @RequestParam("inters") List<String> inters,
                                      @RequestParam Map<String, String> params,
                                      @CookieValue("_ga") String _ga,
                                      @CookieValue("_ga") Cookie cookie) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("params", params);
        return map;
    }

}
