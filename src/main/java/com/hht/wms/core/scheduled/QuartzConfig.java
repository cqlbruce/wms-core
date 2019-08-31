package com.hht.wms.core.scheduled;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.hht.wms.core.scheduled.quartzpure.QuartzJob;

@Configuration
public class QuartzConfig {
	
	
	
	//创建Job对象
	@Bean
	public JobDetailFactoryBean jobDetailFactoryBean(){
		JobDetailFactoryBean factory = new JobDetailFactoryBean();
		factory.setJobClass(QuartzJob.class);
		return factory ; 
	}
	
	//创建 cron Trigger 对象
	@Bean
	public CronTriggerFactoryBean cronTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
		CronTriggerFactoryBean factory = new CronTriggerFactoryBean();
		factory.setJobDetail(jobDetailFactoryBean.getObject());
		factory.setCronExpression("0/2 * * * * ?");
		return factory ; 
	}	
	
	@Bean
	public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean){
		SchedulerFactoryBean factory = new SchedulerFactoryBean();
		//关联trigger
		factory.setTriggers(cronTriggerFactoryBean.getObject());
		return factory;
	} 
	
	

}
