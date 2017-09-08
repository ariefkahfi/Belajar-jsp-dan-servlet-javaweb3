package com.arief.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Arief on 9/8/2017.
 */
public class ResultLoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");


        PrintWriter writer = resp.getWriter();


        StringBuilder html = new StringBuilder();

        html.append("<html>");

        html.append("<head>" +
                "" +
                "<title>Result Servlet</title>" +
                "" +
                "" +
                "</head>");


        html.append("<body>" +
                "" +
                "<h2>" +
                "Hello , " + req.getParameter("username") +
                "" +
                "</h2>" +
                "" +
                "<div>" +
                "Welcome , to our website" +
                "</div>" +
                "" +
                "" +
                "</body>");

        html.append("</html>");



        writer.write(html.toString());

    }




}
