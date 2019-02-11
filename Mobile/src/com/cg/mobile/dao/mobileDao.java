package com.cg.mobile.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mobile.bean.Mobile_info;

public class mobileDao implements mobileRepo {
	public HashMap<Integer, Mobile_info> hm1;
	public mobileDao()
	{
		Mobile_info ob1=new Mobile_info("Samsung","1000",500,4);
		Mobile_info ob2=new Mobile_info("Samsung","1100",700,4);
		Mobile_info ob3=new Mobile_info("Nokia","1200",1000,4);
		Mobile_info ob4=new Mobile_info("Motorola","1300",600,4);
		Mobile_info ob5=new Mobile_info("Oppo","1400",400,4);
		hm1 = new HashMap<>();
		hm1.put(100, ob1);
		hm1.put(101, ob2);
		hm1.put(102, ob3);
		hm1.put(103, ob4);
		hm1.put(104, ob5);
	}
	
	
	@Override
	public void show(HashMap<Integer, Mobile_info> hm1) 
		{
			for(Integer key :hm1.keySet())
			{
				String keys = key.toString();
				String value = hm1.get(key).toString();
				System.out.println(keys +"  "+ value);
			}
		}
}
