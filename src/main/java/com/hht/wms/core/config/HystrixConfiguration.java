package com.hht.wms.core.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.contrib.javanica.aop.aspectj.HystrixCommandAspect;
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@Configuration
public class HystrixConfiguration {
	
	

	//注册Hystrix框架的拦截器，使得框架的注解能够生效
	@Bean
	public HystrixCommandAspect hystrixAspect(){
		return new HystrixCommandAspect();
	}
	
	
	//注入servlet , 拦截url = "/hystrix.stream"
	@Bean
	public ServletRegistrationBean hystrixMetricsStreamServlet(){
		
		System.out.println("+++++++******************");
		ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
		registration.addUrlMappings("/hystrix.stream");
		return registration ;
	}
	

}
