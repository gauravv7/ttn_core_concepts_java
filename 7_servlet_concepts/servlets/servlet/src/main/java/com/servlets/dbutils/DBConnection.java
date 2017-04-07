package com.servlets.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.servlets.entity.Blog;

public class DBConnection {

	public static ArrayList<Blog> getAllBlogEntries() {
		ArrayList<Blog> blogs = new ArrayList<>();

		try {

			// loading drivers for mysql
			Class.forName("com.mysql.jdbc.Driver");

			// creating connection with the database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_servlet", "root",
					"temp1234");
			PreparedStatement ps = con.prepareStatement("select * from blog");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				blogs.add(new Blog(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return blogs;
	}
	
	public static void putBlogEntry(Blog b) {

		try {

			// loading drivers for mysql
			Class.forName("com.mysql.jdbc.Driver");

			// creating connection with the database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_servlet", "root",
					"temp1234");
			PreparedStatement ps = con.prepareStatement("insert into blog(title, content) values(?, ?)");
			ps.setString(1, b.getTitle());
			ps.setString(2, b.getContent());
			ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}
}
