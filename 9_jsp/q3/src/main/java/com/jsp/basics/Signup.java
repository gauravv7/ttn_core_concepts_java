package com.jsp.basics;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by gauravv7 on 15/4/17.
 */
public class Signup extends HttpServlet {

    private HashMap<String, String> users = new HashMap<>();

    @Override
    public void init() throws ServletException {
        if(getServletContext().getAttribute("users")==null){
            getServletContext().setAttribute("users", users);
        }
        users = (HashMap<String, String>) getServletContext().getAttribute("users");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("signup.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("pass");

        if(!users.containsKey(email)){
            users.put(email, password);
        }
        getServletContext().setAttribute("users", users);
        resp.sendRedirect("signin");
    }
}
