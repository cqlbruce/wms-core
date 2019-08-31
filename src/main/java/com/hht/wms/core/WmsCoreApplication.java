package com.hht.wms.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.hht.wms.core.filter.FilterTwo;
import com.hht.wms.core.listener.ListenerTwo;
import com.hht.wms.core.servlet.ServletTwo;

@EnableScheduling
@MapperScan("com.hht.wms.core.dao")
@SpringBootApplication
@ServletComponentScan // 在springBoot启动时会扫描@WebServlet，并将该类实例化 servlet注册方式之一
public class WmsCoreApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(WmsCoreApplication.class, args);
	}
	
	//使用方法方式注册servlet
	@Bean
	public ServletRegistrationBean getServletRegistrationBean(){
		ServletRegistrationBean bean = new ServletRegistrationBean(new ServletTwo());
		bean.addUrlMappings("/second");
		return bean;
	}
	
	//使用方法方式注册filter
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean(){
		FilterRegistrationBean bean = new FilterRegistrationBean(new FilterTwo());
		//bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
		bean.addUrlPatterns("/second");
		return bean;
	}
	
	
	/**
	 * 使用方法方式注册filterlistener
	 */
	@Bean
	public ServletListenerRegistrationBean<ListenerTwo> getServletListenerRegistrationBean(){
		ServletListenerRegistrationBean<ListenerTwo> bean= new ServletListenerRegistrationBean<ListenerTwo>(new ListenerTwo());
		return bean;
	}
}
