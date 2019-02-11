package com.cg.mobile.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.mobile.bean.Mobile_info;
import com.cg.mobile.bean.Purchase_details;


public class container {
	static Map<Integer, Mobile_info> map;
	static Map<Integer, Purchase_details> map1;
	public  HashMap<Integer, Purchase_details> purchase(Purchase_details p)
	{ int orderid=100;
	
		ArrayList<Purchase_details> obdetail = new ArrayList<>(); 
		obdetail.add(p);
		
		HashMap<Integer,Purchase_details > hm2 = new HashMap<>();
		for(int i=0;i<obdetail.size();i++)
		{
			hm2.put(orderid, obdetail.get(i));
			orderid++;
		}
	
		return hm2;
		
	}
	public void addPurchaseDetails(int n,HashMap<Integer, Mobile_info> hm1,HashMap<Integer, Purchase_details> hm2)
	{
		Integer mobileIdLink=0;
		Integer purchasekey=0;
		for(Integer purchaseId : hm2.keySet())
		{
			Purchase_details pd_obj=hm2.get(purchaseId);
			mobileIdLink=(Integer)pd_obj.getMobileId();
			purchasekey=purchaseId;
		}
		int countdec=hm1.get(mobileIdLink).getCount();
		countdec= countdec-n;
		hm1.get(mobileIdLink).setCount(countdec);
		System.out.println(mobileIdLink + " "+ hm1.get(mobileIdLink)+ " "+ purchasekey+ " "+ hm2.get(purchasekey));
		
	}
	
	static Map<Integer, Mobile_info> createCollection(){
		
		if(map == null)
			map = new HashMap<Integer, Mobile_info>();
		
		return map;
	}


}
