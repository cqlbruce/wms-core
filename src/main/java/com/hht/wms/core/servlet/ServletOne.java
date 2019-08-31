package com.hht.wms.core.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *SpringBoot整合Servlet方式一
 *
 *<servlet>
 *	<servlet-name>FirstServlet</servlet-name>
 *	<servlet-class>com.bjsxt.servlet.FirstServlet</servlet-class>
 *</servlet>
 *
 *<servlet-mapping>
 * <servlet-name>FirstServlet</servlet-name>
 * <url-pattern>/first</url-pattern>
 *</servlet-mapping>
 *
 */

@WebServlet(name="ServletOne" , urlPatterns="/first")
public class ServletOne extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException , IOException{
		System.out.println("FirstServlet.....");
	}
}
