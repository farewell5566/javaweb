package com.xc.controller;

import com.xc.service.UserService;
import com.xc.service.impl.UserServiceImpl;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("接受到了");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        if(userService.existUsername(username)){
            System.out.println("账户存在");
            request.getRequestDispatcher("/pages/user/regist_success.html").forward(request,response);
        }
        else {
            System.out.println("账户不存在");
            request.getRequestDispatcher("/pages/user/regist.html").forward(request,response);

        }

    }
}
