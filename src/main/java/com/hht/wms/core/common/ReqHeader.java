package com.hht.wms.core.common;

import io.swagger.annotations.ApiModelProperty;


/**
 * 
 *
 */
public class ReqHeader {
	
    /**
     * token_id
     */
    @ApiModelProperty(value = "token号")
    private String token_id;

	public String getToken_id() {
		return token_id;
	}

	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}

    
    
}
