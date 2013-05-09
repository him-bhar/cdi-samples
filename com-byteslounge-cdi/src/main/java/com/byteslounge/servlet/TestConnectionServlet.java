package com.byteslounge.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.byteslounge.connection.Connection;
import com.byteslounge.connection.TestConnection;

@WebServlet(name = "testServlet", urlPatterns = {"/testServlet"})
public class TestConnectionServlet extends HttpServlet {

	private static final long serialVersionUID = -3995970242890631574L;
	
	@Inject
	@TestConnection
	private Connection connection;
	
	protected void doGet(HttpServletRequest request,
		    HttpServletResponse response)
		    throws ServletException, IOException {
		
		System.out.println("Doing something with connection: " + connection.toString());
		
	}
}
