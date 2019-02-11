package com.cg.mobile.bean;

public class Mobile_info {
	String MobName;
	String model;
	int price;
	int count;
	public Mobile_info(String mobName, String model, int price,int count) {
		super();
		MobName = mobName;
		this.model = model;
		this.count = count;
		this.price=price;
	}
	public String getMobName() {
		return MobName;
	}
	public void setMobName(String mobName) {
		MobName = mobName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Mobile_info [MobName=" + MobName + ", model=" + model + ", price=" + price + ", count=" + count + "]";
	}

}
