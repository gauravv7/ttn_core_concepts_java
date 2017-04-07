package com.servlets.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlets.dbutils.DBConnection;
import com.servlets.entity.Blog;

/**
 * Servlet implementation class Welcome
 */
@WebServlet(urlPatterns = {"/welcome", "/addpost"})
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!isAuthenticated(request, response)){ response.sendRedirect("login");};
		if(request.getRequestURI().contains("addpost")){
			addPost(request, response);
		} else{
		viewPosts(request, response);
		}
	}

	private void viewPosts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!isAuthenticated(request, response)){ response.sendRedirect("login");};
		request.setAttribute("blogs", DBConnection.getAllBlogEntries());
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}

	private void addPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!isAuthenticated(request, response)){ response.sendRedirect("login");};
		request.setAttribute("blogs", DBConnection.getAllBlogEntries());
		request.getRequestDispatcher("addpost.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!isAuthenticated(request, response)){ response.sendRedirect("login");};
		if(request.getRequestURI().contains("addpost")){
			addPostInDB(request, response);
		}
	}

	private void addPostInDB(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(!isAuthenticated(request, response)){ response.sendRedirect("login");};
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		ArrayList<String> errors = new ArrayList<>();
		if(title.length()==0){
			errors.add("title cannot be empty");
		}
		if(content.length()==0){
			errors.add("content cannot be empty");
		}
		if(!errors.isEmpty()){
			System.out.println(errors.size());
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("addpost.jsp").forward(request, response);
		} else{
			Blog b = new Blog(title, content);
			DBConnection.putBlogEntry(b);
			response.sendRedirect("welcome");
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
