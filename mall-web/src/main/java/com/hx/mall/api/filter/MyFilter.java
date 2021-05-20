package com.hx.mall.api.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
@Component
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) { }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        System.out.println("RequestURL-> "+req.getRequestURL());
        chain.doFilter(request,response);
    }
    @Override
    public void destroy() { }
}

