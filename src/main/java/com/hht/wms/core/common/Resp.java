package com.hht.wms.core.common;

import java.io.Serializable;

public class Resp<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String respCode ; 
	
	private String respMsg ; 
	
	private T data ; 

	public Resp(){
		this.respCode = Constant.SUCCESS_CODE ; 
		this.respMsg = "SUCCESS" ; 
	}
	
	public Resp(String code , String respMsg ){
		this.respCode = code ; 
		this.respMsg = respMsg ; 
	}
	
	public Resp(String code , String respMsg , T data){
		this.respCode = code ; 
		this.respMsg = respMsg ; 
		this.setData(data);
	}
	
	

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	

}
