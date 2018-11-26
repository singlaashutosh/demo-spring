package com.authenticity.authapp.bean;

public class UniqueKey {
int uid;
String assignStatus;
String validationStatus;
String generatedDate;



public UniqueKey(int uid, String assignStatus, String validationStatus, String generatedDate) {
	super();
	this.uid = uid;
	this.assignStatus = assignStatus;
	this.validationStatus = validationStatus;
	this.generatedDate = generatedDate;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getAssignStatus() {
	return assignStatus;
}
public void setAssignStatus(String assignStatus) {
	this.assignStatus = assignStatus;
}
public String getValidationStatus() {
	return validationStatus;
}
public void setValidationStatus(String validationStatus) {
	this.validationStatus = validationStatus;
}
public String getGeneratedDate() {
	return generatedDate;
}
public void setGeneratedDate(String generatedDate) {
	this.generatedDate = generatedDate;
}




}
