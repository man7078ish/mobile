package com.cg.mobileapp.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.mobileapp.bean.Customer;
import com.cg.mobileapp.bean.Mobile;

public interface CustDetail {
	
	public Map AddCustDetail(Customer c);
	public void purchase(HashMap<Integer,Mobile> h1,HashMap<Integer,Customer> h2);
	

}
