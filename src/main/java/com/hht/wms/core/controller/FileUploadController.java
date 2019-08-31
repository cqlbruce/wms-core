package com.hht.wms.core.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//spring boot 文件上传

@RestController //表示该类下方法的返回值会自动做json格式的转换
public class FileUploadController {

	
	//处理文件上传
	@RequestMapping("/fileUpload")
	public Map<String , Object> fileUpload(MultipartFile fileName){

		System.out.println(fileName.getOriginalFilename());
		try {
			fileName.transferTo(new File("A:/temp/" + fileName.getOriginalFilename()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String , Object> map = new HashMap<String , Object>();
		map.put("msg", "ok");
		
		return map ; 
	}
	
	
}
