package com.hht.wms.core.common;


import java.io.Serializable;

import com.hht.wms.core.enums.RespStatus;


public class Resp<T> implements Serializable {
    private static final long serialVersionUID = 3453453453445L;

    public final static String SUCCESS_CODE = "200";
    public final static String FAIL_CODE = "9999";
    /**
     * 返回状态码
     */
    private RespHeader respHeader;

    /**
     * 返回内容
     */
    private T data;

    public Resp() {}

    public Resp(String code, String msg, T data) {
        RespHeader responseHeader =new RespHeader();
        responseHeader.setRespCode(code);
        responseHeader.setRespMsg(msg);
        this.respHeader = responseHeader;
        this.data = data;
    }

    public RespHeader getRespHeader() {
        return respHeader;
    }

    public void setRespHeader(RespHeader respHeader) {
        this.respHeader = respHeader;
    }

    public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static <T>Resp success(String msg, T responseBody){

        return new Resp<T>(SUCCESS_CODE,msg,responseBody);
    }

    public static <T>Resp doing(String msg, T responseBody){
        return new Resp<T>(RespStatus.DOING.getCode(),msg,responseBody);
    }

    //快速返回失败状态
    public static <T>Resp fail(String msg){
        return new Resp<T>(FAIL_CODE,msg,null);
    }
    //快速返回失败状态
    public static <T>Resp fail(String code,String msg){
        return new Resp<T>(code,msg,null);
    }
}