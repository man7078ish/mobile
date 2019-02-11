package com.cg.mobile.service;

import java.util.HashMap;

import com.cg.mobile.bean.Mobile_info;
import com.cg.mobile.dao.mobileDao;
import com.cg.mobile.dao.mobileRepo;
import com.cg.mobile.exception.MobilePurchaseException;

public class MobileServiceImpl implements mobileService {
	mobileRepo dao;
	
	public MobileServiceImpl(mobileDao dao) {
		super();
		dao=new mobileDao();
	}

	
	public void validate_mob(int mobno,HashMap<Integer,Mobile_info> hm1,int mobId)throws MobilePurchaseException {
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
			try
			{
			throw new MobilePurchaseException("Not sufficient mobiles");
		}
			catch(MobilePurchaseException e)
			{
				System.out.println(e.getMessage());
				
			}
			//throw new MobilePurchaseException("Not sufficient mobiles");
		}
		else
		{
			System.out.println("enter your name");
		}
	}

	@Override
	public void validate_count(HashMap<Integer, Mobile_info> hm1,int mobileId)throws MobilePurchaseException {
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
			try
			{
			throw new MobilePurchaseException("mobiles not available");
		}
			catch(MobilePurchaseException e)
			{
				System.out.println(e.getMessage());
				
			}
			//throw new MobilePurchaseException("mobiles not available");
			//throw new lessCountException();
		}
	}


	@Override
	public boolean validate_mobId(HashMap<Integer, Mobile_info> hm1, int mobileId) throws MobilePurchaseException {
		// TODO Auto-generated method stub
		Mobile_info md1=null;
		int count=0;
		/*for(Integer key: hm1.keySet())
		{   if(key==mobileId) {
			md1=hm1.get(mobileId);
		}
		else
		{
			try
			{
			throw new MobilePurchaseException("mobileID Unavailable");
		}
			catch(MobilePurchaseException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		}*/
		if( !(hm1.keySet().contains(mobileId)))
				{
			try
			{
			throw new MobilePurchaseException("mobileID Unavailable");
		}
			catch(MobilePurchaseException e)
			{
				System.out.println(e.getMessage());
				return false;
			}
				}
		else
		{
			return true;
		}
	
		
	}
	
}
