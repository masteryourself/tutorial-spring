package pers.masteryourself.tutorial.spring.framework.async.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * <p>description : AsyncController
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/4/5 1:46
 */
@Controller
public class AsyncController {

    /**
     * 如果方法返回 {@link Callable}，Spring 将会异步处理，将任务提交到 {@link org.springframework.core.task.TaskExecutor}，使用一个隔离的线程执行
     * {@link org.springframework.web.servlet.DispatcherServlet} 和所以的 {@link javax.servlet.Filter} 退出 web 容器的线程，但是 response 保持打开状态
     * {@link Callable} 返回结果，Spring MVC 将请求重新派发给容器，恢复之前的处理，根据 {@link Callable} 返回的结果，Spring MVC 继续进行视图渲染流程（接收请求 -> 视图渲染）
     *
     * @return
     */
    @RequestMapping(value = "/async")
    @ResponseBody
    public Callable<String> async() {
        System.out.println("主线程开始：" + Thread.currentThread().getName());
        Callable<String> result = () -> {
            System.out.println("任务线程开始：" + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(2);
            System.out.println("任务线程结束：" + Thread.currentThread().getName());
            return "success";
        };
        System.out.println("主线程结束：" + Thread.currentThread().getName());
        return result;

        // 主线程开始：http-nio-8080-exec-4
        //主线程结束：http-nio-8080-exec-4
        //任务线程开始：MvcAsync1
        //任务线程结束：MvcAsync1
    }

}
