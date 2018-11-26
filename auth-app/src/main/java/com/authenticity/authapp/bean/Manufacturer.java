package com.authenticity.authapp.bean;

public class Manufacturer {
	
	int mId ;
	String mName, address, contact;
	
	
	
	public Manufacturer(int mId, String mName, String address, String contact) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.address = address;
		this.contact = contact;
	}
	
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	

}
