package pers.masteryourself.tutorial.spring.cloud.zuul.filter.component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>description : ZuulFilter
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/7/19 13:10
 */
@Component
public class ZuulRouteFilter extends ZuulFilter {

    private static final AtomicInteger COUNT = new AtomicInteger(0);

    @Override
    public String filterType() {
        // 过滤器类型，有四种
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 过滤器执行顺序，值越小优先级越高
        return -100;
    }

    @Override
    public boolean shouldFilter() {
        if (COUNT.getAndIncrement() % 3 == 0) {
            RequestContext currentContext = RequestContext.getCurrentContext();
            // 不会继续往下执行, 网关直接响应给客户
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseBody("{\"code\": \"400\",\"mg\": \"you are denied\"}");
            currentContext.setResponseStatusCode(401);
            return false;
        }
        // 返回 true 表示通过过滤器, 会执行 run() 方法
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 获取请求上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        // 从上下文中获取 HttpServletRequest
        HttpServletRequest request = currentContext.getRequest();
        System.out.println("访问者IP：【" + request.getRemoteAddr() + "】访问地址:【" + request.getRequestURI() + "】");
        // 这里的返回值没有作用
        return null;
    }

}
