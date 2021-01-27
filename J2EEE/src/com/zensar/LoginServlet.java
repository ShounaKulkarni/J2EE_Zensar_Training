package com.zensar;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
import java.io.*;

public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		String name = request.getParameter("fname");
		System.out.println("Name: "+name);
	}

}
