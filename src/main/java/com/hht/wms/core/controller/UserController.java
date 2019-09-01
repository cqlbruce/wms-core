package com.hht.wms.core.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.hht.wms.core.common.Resp;
import com.hht.wms.core.dto.LoginRespDto;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/user/")
@CrossOrigin 
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class) ; 
	
	@PostMapping("login")
    @ApiOperation(value = "用户登录", notes = "")
//    public Resp<LoginRespDto> login(@RequestBody Req<LoginReqDto> req) {
	public Resp<LoginRespDto> login(HttpServletRequest request) {
		String userName = request.getParameter("userName");
//		logger.info("login..............{}",JSON.toJSON(req) );
		LoginRespDto respDto = new LoginRespDto();
		respDto.setToken("asdfasdfasdbab"+new Random(9));
		logger.info("login..............{}",JSON.toJSON(Resp.success("登陆成功" , respDto)) );
		return Resp.success("登陆成功" , respDto);
    }

}
