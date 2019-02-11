package com.cg.mobile.service;

import java.util.HashMap;

import com.cg.mobile.bean.Mobile_info;
import com.cg.mobile.bean.Purchase_details;
import com.cg.mobile.exception.MobilePurchaseException;

public interface mobileService {
	
	public void validate_mob(int mobno,HashMap<Integer,Mobile_info> hm1,int mobId) throws MobilePurchaseException;

	

	boolean validate_mobId(HashMap<Integer, Mobile_info> hm1, int mobileId)throws MobilePurchaseException;

	void validate_count( HashMap<Integer, Mobile_info> hm1, int mobileId) throws MobilePurchaseException;
}
