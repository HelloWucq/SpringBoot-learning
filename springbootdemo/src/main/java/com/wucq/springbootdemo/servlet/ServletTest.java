package com.wucq.springbootdemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * ServletTest
 */
@WebServlet(urlPatterns = "/servlettest",description = "Servlet说明")
public class ServletTest  extends HttpServlet{

    private static final long serialVersionUID = -868538540L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-------------doGet()--------------");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----------------doPost()-------------");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>我的名字是servlet</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}