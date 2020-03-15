package pers.masteryourself.tutorial.spring.boot.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * <p>description : MyFilter
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/15 19:57
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter process...");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy");
    }

}
