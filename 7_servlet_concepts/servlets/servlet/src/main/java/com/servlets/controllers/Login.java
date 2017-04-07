package com.servlets.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(description = "Login servlet", urlPatterns = { "/login" }, initParams = {
	@WebInitParam(name= "email", value="aa"),
	@WebInitParam(name= "pass", value= "aa"),
	})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		if(isAuthenticated(request, response)){
//			response.sendRedirect("welcome");
//		}
//		RequestDispatcher rs = request.getRequestDispatcher("index.html");
//        rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        if(this.getServletConfig().getInitParameter("email").equals(email) && this.getServletConfig().getInitParameter("pass").equals(pass))
        {
            request.getSession().setAttribute("isAuthenticated", "true");
            response.sendRedirect("welcome");
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("index.html");
           rs.forward(request, response);
        }
    }
	
	protected boolean isAuthenticated(HttpServletRequest request, HttpServletResponse response){
		if(request.getSession(false)!=null){
			if(request.getSession(false).getAttribute("isAuthenticated")!=null){
				if(request.getSession(false).getAttribute("isAuthenticated").equals("true")){
					return true;
				}				
			}
		}

		return false;
	}

}
