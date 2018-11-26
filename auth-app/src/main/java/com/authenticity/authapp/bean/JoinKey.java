package com.authenticity.authapp.bean;

public class JoinKey {

	int uId, pId, cId;

	public JoinKey(int uId, int pId, int cid) {
		super();
		this.uId = uId;
		this.pId = pId;
		this.cId = cid;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getCid() {
		return cId;
	}

	public void setCid(int cid) {
		this.cId = cid;
	}
	
	
}
