package com.hht.wms.core.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Req;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.LoginReqDto;
import com.hht.wms.core.dto.LoginRespDto;
import com.hht.wms.core.dto.UserInfoRespDto;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/user/")
@CrossOrigin 
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class) ; 
	
	@PostMapping("login")
    @ApiOperation(value = "用户登录", notes = "")
    public Resp<LoginRespDto> login(@RequestBody Req<LoginReqDto> req) {
	//public Resp<LoginRespDto> login(HttpServletRequest request) {
		//String userName = request.getParameter("userName");
 		logger.info("login..............{}",JSON.toJSON(req) );
		LoginRespDto respDto = new LoginRespDto();
		respDto.setToken("asdfasdfasdbab"+new Random(9));
		logger.info("login..............{}",JSON.toJSON(Resp.success("登陆成功" , respDto)) );
		return Resp.success("登陆成功" , respDto);
    }

	@PostMapping("info")
    @ApiOperation(value = "用户登录", notes = "")
//    public Resp<UserInfoRespDto> getUserInfo(@RequestBody Req<UserInfoReqDto> req) {
	public Resp<UserInfoRespDto> getUserInfo(HttpServletRequest request) {
//      String userName = request.getParameter("userName");
//		logger.info("login..............{}",JSON.toJSON(req) );
		UserInfoRespDto respDto = new UserInfoRespDto();
		respDto.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
		respDto.setIntroduction("I am a super administrator");
		respDto.setName("Super Admin");
		respDto.setRoles("admin");
		return Resp.success("登陆成功" , respDto);
    }
	
	@PostMapping("logout")
    @ApiOperation(value = "退出登陆", notes = "")
//    public Resp<UserInfoRespDto> getUserInfo(@RequestBody Req<UserInfoReqDto> req) {
	public Resp<UserInfoRespDto> logout(HttpServletRequest request) {
//      String userName = request.getParameter("userName");
//		logger.info("login..............{}",JSON.toJSON(req) );
		
		return Resp.success("退出成功","");
    }

	

}
