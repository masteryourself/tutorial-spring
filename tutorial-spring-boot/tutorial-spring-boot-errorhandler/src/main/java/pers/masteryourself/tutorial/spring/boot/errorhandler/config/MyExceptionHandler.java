package pers.masteryourself.tutorial.spring.boot.errorhandler.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>description : MyExceptionHandler
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 18:56
 */
@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 直接响应 json 数据, 处理不够优雅
     *
     * @param e 异常
     * @return json 数据
     */
    /*@ResponseBody
    @ExceptionHandler(Exception.class)
    public Map<String, Object> handleException(Exception e) {
        Map<String, Object> map = new HashMap<>(10);
        map.put("code", "999999");
        map.put("message", e.getMessage());
        return map;
    }*/

    /**
     * 转发到 /error 请求
     *
     * @param e       异常
     * @param request request
     * @return 转发
     */
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e, HttpServletRequest request) {
        request.setAttribute("javax.servlet.error.status_code", 500);
        request.setAttribute("author", "masteryourself");
        // 转发到 /error
        return "forward:/error";
    }

}
