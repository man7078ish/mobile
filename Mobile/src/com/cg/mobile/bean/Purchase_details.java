package com.cg.mobile.bean;

public class Purchase_details {
	String name;
	long phoneNo;
	int mobileId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public Purchase_details(String name, long phoneNo, int mobileId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.mobileId = mobileId;
	}
	@Override
	public String toString() {
		return "Purchase_details [name=" + name + ", phoneNo=" + phoneNo + ", mobileId=" + mobileId + "]";
	}
	
	

}
