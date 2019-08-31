package com.hht.wms.core.scheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SpringScheduledTest {

	//cron 表达式 秒 分 时 日 星期 月 年
	@Scheduled(cron="0/2 * * * * ?")
	public void scheduledMethod(){
		System.out.println("定时器被触发" + new Date());
	}
	
}
