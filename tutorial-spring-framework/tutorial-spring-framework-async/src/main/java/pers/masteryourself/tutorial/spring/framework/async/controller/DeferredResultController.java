package pers.masteryourself.tutorial.spring.framework.async.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * <p>description : DeferredResultController
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/5 2:02
 */
@Controller
public class DeferredResultController {

    private Queue<DeferredResult<String>> queue = new ConcurrentLinkedQueue<>();

    /**
     * 可以将返回值定义成 {@link DeferredResult}，一旦调用 setResult() 方法，就会返回结果
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/createOrder")
    public DeferredResult<String> createOrder() {
        DeferredResult<String> deferredResult = new DeferredResult<>((long) 3000, "create fail...");
        queue.add(deferredResult);
        return deferredResult;
    }

    @ResponseBody
    @RequestMapping("/doCreate")
    public String doCreate() {
        DeferredResult<String> deferredResult = queue.poll();
        if (deferredResult == null) {
            return null;
        }
        deferredResult.setResult(UUID.randomUUID().toString());
        return "success";
    }

}
