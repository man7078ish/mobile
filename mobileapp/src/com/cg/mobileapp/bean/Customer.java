package com.cg.mobileapp.bean;

import java.util.Date;

public class Customer {
	
	private String name;
	private String mailid;
	private int mobileid;
	
	public Customer(String name, String mailid, int mobileid) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.mobileid = mobileid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	@Override
	public String toString() {
		return " name=" + name + ", mailid=" + mailid + ", mobileid=" + mobileid ;
	}
	
	
	
}
