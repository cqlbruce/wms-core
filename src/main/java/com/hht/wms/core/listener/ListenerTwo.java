package com.hht.wms.core.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListenerTwo implements ServletContextListener{
	
	public void contextDestroyed(ServletContextEvent arg0){
		System.out.println("SecondListener..destroy.....");
	}

	public void contextInitialized(ServletContextEvent arg0){
		System.out.println("SecondListener..init.....");
	}
}
