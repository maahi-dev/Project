/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package Filters;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.faces.context.FacesContext;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author muzz
 */
@WebFilter(filterName = "LoginFilter", urlPatterns = {"/index.jsf", "/"}, dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE})
public class LoginFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

//        HttpServletRequest request1 = (HttpServletRequest) request;
//        HttpServletResponse response1 = (HttpServletResponse) response;
//        String loginURI = "https://localhost:8181/E-Opinion/index.jsf";
//        HttpSession session = request1.getSession(false);
//
//        try {
//            boolean loggedIn = session != null && session.getAttribute("userType") != null;
//            if (loggedIn) {
//                System.out.println("Already Login");
//                chain.doFilter(request, response);
//            } else {
//                response1.sendRedirect(loginURI);
//                chain.doFilter(request, response);
//                System.out.println("NOT LOGIN");
//            }
//        } catch (Throwable t) {
//            t.printStackTrace();
//        }
        chain.doFilter(request, response);
    }

    public void destroy() {
    }

    public void init(FilterConfig filterConfig) {
    }

}
