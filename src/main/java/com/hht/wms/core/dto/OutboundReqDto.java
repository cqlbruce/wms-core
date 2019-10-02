package com.hht.wms.core.dto;

public class OutboundReqDto {

	private String id ; 
	
	private String clp ; 
	
	private int pcs ; 
	
	private String po ;
	
	private String sku ; 
	
	private String so ;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClp() {
		return clp;
	}

	public void setClp(String clp) {
		this.clp = clp;
	}

	public int getPcs() {
		return pcs;
	}

	public void setPcs(int pcs) {
		this.pcs = pcs;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	} 
	
	
	
	
}
