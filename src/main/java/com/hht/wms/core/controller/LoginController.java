package com.hht.wms.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hht.wms.core.dao.UserInfoMapper;
import com.hht.wms.core.entity.UserInfo;
import com.hht.wms.core.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private UserInfoMapper userMapper ; 
	
	private LoginService loginService ; 
	
	@GetMapping("/login")
	public String login(String userName , String passwd){
		
		loginService.login("cql", "123456");
		System.out.println("login..........vvvvv..........");
		System.out.println("userName = " + userName + "==passwd==" + passwd);
		System.out.println("asdfasdf");
		List<UserInfo> list = userMapper.selectAll();
		System.out.println("login............aaa...............");
		for(UserInfo user : list){
			System.out.println(user.getUserId());
		}
		return "success";
	}
	

}
