package com.hht.wms.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


/**
 *SpringBoot整合Filter 方式一
 *<filter>
 *	<filter-name>FirstFilter</filter-name>
 *	<filter-class>com.bjsxt.filter.FirstFilter</filter-class>
 *</filter>
 *<filter-mapping>
 *	<filter-name>FirstFilter</filter-name>
 *	<url-pattern>/first</url-pattern>
 *</filter-mapping>
 */
//@WebFilter(filterName="FirstFilter",urlPatterns={"*.do","*.jsp"})
//方法一使用注解注册过滤器
@WebFilter(filterName="FilterOne",urlPatterns="/first")
public class FilterOne implements Filter{

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("...coming...filter......");
		arg2.doFilter(arg0, arg1);
		System.out.println("........filter...end.......");
	}
	
	public void destroy(){
		
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
	}
	
	

}
