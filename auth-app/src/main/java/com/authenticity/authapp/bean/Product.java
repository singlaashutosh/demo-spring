package com.authenticity.authapp.bean;

public class Product {

	
	public Product(int pId, int cId, String pName, String pDesc) {
		super();
		this.pId = pId;
		this.cId = cId;
		this.pName = pName;
		this.pDesc = pDesc;
	}
	int pId, cId;
	String pName, pDesc;
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	
}
