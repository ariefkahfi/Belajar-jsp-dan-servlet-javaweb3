package com.arief.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Arief on 9/8/2017.
 */
public class authFilter implements Filter {


    private ServletContext context;


    public void init(FilterConfig filterConfig) throws ServletException {
         context = filterConfig.getServletContext();

         context.log("Init filter.....");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        context.log("before filterChain.doFilter......");


        if(servletRequest.getParameter("username").trim().equals("arief") &&
                servletRequest.getParameter("password").trim().equals("arief")){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            HttpServletResponse response = (HttpServletResponse)servletResponse;
            response.sendError(HttpServletResponse.SC_FORBIDDEN);
        }



       context.log("after filterChain.doFilter....");


    }


    public void destroy() {
      context.log("Destroying filter.....");
    }
}
