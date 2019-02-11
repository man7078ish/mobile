package com.cg.mobile.service;

import java.util.HashMap;

import com.cg.mobile.bean.Mobile_info;
import com.cg.mobile.bean.Purchase_details;

public interface mobileService {
	public void addPurchaseDetails(int n,HashMap<Integer, Mobile_info> hm1,HashMap<Integer, Purchase_details> hm2);
	
	public void validate_mob(int mobno,HashMap<Integer,Mobile_info> hm1,int mobId);

	



	void validate_count( HashMap<Integer, Mobile_info> hm1, int mobileId);
}
