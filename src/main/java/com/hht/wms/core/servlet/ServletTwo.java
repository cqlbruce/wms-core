package com.hht.wms.core.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTwo extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException , IOException{
		System.out.println("SecondServlet..........");
	}
}