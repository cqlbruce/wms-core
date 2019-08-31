package com.hht.wms.core.controller;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping(value="/hystrix")
public class HystrixController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HystrixController.class);

	
	
	@RequestMapping(value="/ok" , method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod="okFallback" , commandProperties = {
			@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds" , value="100"),
			@HystrixProperty(name="circuitBreaker.requestVolumeThreshold" , value="50"),
			@HystrixProperty(name="circuitBreaker.errorThresholdPercentage" , value="5")})
	public String ok() throws Exception{
		System.out.println("comming ok .................");
		int k = new Random().nextInt(200);
		LOG.info(String.format("1=%s", k));
		System.out.println(Thread.currentThread().getId() + "====l========================" + k);
		TimeUnit.MILLISECONDS.sleep(k);
		return "ok";
	}
	
	public String okFallback(Throwable e){
//		System.out.println(Thread.currentThread().getId() + "====execute okFallback !!!" + e.getMessage());
		System.out.println(Thread.currentThread().getId() + "====execute okFallback !!!" );
//		LOG.error("error" , e);
		return "fallback";
	}
	
	public String okFallback(){
		System.out.println(Thread.currentThread().getId() + "====fallbacksssss-------------------------");
		return "fallbacksssss";
	}
}
