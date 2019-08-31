package com.hht.wms.core.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerOne implements ServletContextListener{
	
	public void contextDestroyed(ServletContextEvent args0){
		System.out.println("contextDestroyed.....................");
	}
	
	public void contextInitialized(ServletContextEvent args0){
		System.out.println("..........Listener.....init.......");
	}

}
