package com.hht.wms.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.hht.wms.core.dao")
@SpringBootApplication
public class WmsCoreApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(WmsCoreApplication.class, args);
	
	}
	
}
 