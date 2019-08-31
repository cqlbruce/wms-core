package com.hht.wms.core.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hht.wms.core.common.Resp;

@RestControllerAdvice
public class GlobalException {
	
	private static final Logger log = LoggerFactory.getLogger(GlobalException.class);
	
	
	@ExceptionHandler(value={java.lang.RuntimeException.class})
	public Resp globalExceptionHandler(Exception e){
		log.info("global exception ... " , e);
		return new Resp<>("500" , "网络异常"); 
	} 
	

}
