package com.lansus.servlet;



import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.net.URLDecoder;


/**
 * Created by wangjun on 17-4-13.
 */
public class LoginServlet extends HttpServlet {


    public LoginServlet() {
        super();
    }

    @Override


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        String acceptjson = "";
            String req = request.getParameter("request");
            acceptjson =req.toString();
            response.getWriter().write(URLDecoder.decode(acceptjson));
            System.out.print(acceptjson);




    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
