package com.cdk.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "ValidLocaleFilter")
public class ValidLocaleFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if(req.getLocale().getCountry().equalsIgnoreCase("China")){
            PrintWriter pw = resp.getWriter();
            pw.write("Chinese people not welcomed in India :(");
        }else {
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
