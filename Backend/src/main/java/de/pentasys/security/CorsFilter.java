package de.pentasys.security;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        httpServletResponse.addHeader("Access-Control-Max-Age", "3600");
        httpServletResponse.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, x-auth-token");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}