package com.hht.wms.core.scheduled.quartzpure;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class QuartzJob implements Job{

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		System.out.println("Execute......." + new Date());
		
	}
	
	

}
