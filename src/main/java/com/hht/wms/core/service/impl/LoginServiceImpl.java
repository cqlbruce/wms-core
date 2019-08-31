package com.hht.wms.core.service.impl;

import org.springframework.stereotype.Service;

import com.hht.wms.core.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	
	public void login(String userName, String psw) {
		throw new RuntimeException("登录有误!!!");		
	}

	
}
