package com.wucq.springbootdemo.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * FilterTest
 */
@WebFilter(filterName = "filterTest", urlPatterns = "/*")
public class FilterTest implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        System.out.println("执行过滤器！");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁！");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器");
    }
}