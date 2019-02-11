package com.cg.mobile.service;

import java.util.HashMap;
import java.util.Scanner;

import com.cg.mobile.bean.Mobile_info;
import com.cg.mobile.bean.Purchase_details;
import com.cg.mobile.dao.container;
import com.cg.mobile.dao.mobileDao;
import com.cg.mobile.dao.mobileRepo;

public class MobileServiceImpl implements mobileService {
	mobileRepo dao;
	
	public MobileServiceImpl(mobileDao dao) {
		super();
		dao=new mobileDao();
	}

	
	public void validate_mob(int mobno,HashMap<Integer,Mobile_info> hm1,int mobId) {
		Mobile_info md1=null;
		int count=0;
		for(Integer key: hm1.keySet())
		{   if(key==mobId) {
			md1=hm1.get(mobId);
		}
		
		}
		count=md1.getCount();
		if(mobno>count)
		{
			System.out.println("not sufficient mobiles");
		}
		else
		{
			System.out.println("enter your name");
		}
	}

	@Override
	public void validate_count(HashMap<Integer, Mobile_info> hm1,int mobileId) {
		// TODO Auto-generated method stub
		Mobile_info md1=null;
		int count=0;
		for(Integer key: hm1.keySet())
		{   if(key==mobileId) {
			md1=hm1.get(mobileId);
		}
		
		}
		count=md1.getCount();
		if(count>0)
		{
			System.out.println("mobile available enter no.of mobile to be purchased");
			
		}
		else
		{
			System.out.println("not available");
			//throw new lessCountException();
		}
	}
	
}
