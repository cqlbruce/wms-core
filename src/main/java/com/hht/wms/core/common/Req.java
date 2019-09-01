package com.hht.wms.core.common;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;


public class Req<T> implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 请求头
     */
    @ApiModelProperty(value = "请求头", required = true)
    private ReqHeader reqHeader;

    /**
     * 请求内容
     */
    @ApiModelProperty(value = "请求内容", required = true)
    private T reqBody;

    public Req() {

    }

    public Req(String tokenId, T reqBody) {
        ReqHeader  reqHeader =new ReqHeader();
        reqHeader.setToken_id(tokenId);
        this.reqHeader = reqHeader;
        this.reqBody = reqBody;
    }
    public ReqHeader getReqHeader() {
        return reqHeader;
    }

    public void setReqHeader(ReqHeader reqHeader) {
        this.reqHeader = reqHeader;
    }

    public T getReqBody() {
        return reqBody;
    }

    public void setReqBody(T reqBody) {
        this.reqBody = reqBody;
    }
}
