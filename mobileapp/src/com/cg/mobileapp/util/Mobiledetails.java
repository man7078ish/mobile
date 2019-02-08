package com.cg.mobileapp.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.mobileapp.bean.Mobile;

public class Mobiledetails implements MobDetail {
	public HashMap<Integer, Mobile> h1=new HashMap();
	@Override
	public Map AddmobDetails() {
		// TODO Auto-generated method stub
	
		Mobile m1=new Mobile(4, "Samsung", "Galaxy");
		Mobile m2=new Mobile(4, "Nokia", "Lumia");
		Mobile m3=new Mobile(4, "Honor", "9n");
		Mobile m4=new Mobile(4, "Oppo", "A83");
		Mobile m5=new Mobile(4, "Motorola", "1000");
		
		h1.put(101,m1);
		h1.put(102,m2);
		h1.put(103,m3);
		h1.put(104,m4);
		h1.put(105,m5);
		return h1;

	}
	public void ShowList()
	{
		for(Integer i:h1.keySet())
		{
		String key=i.toString();
		String value=h1.get(i).toString();
		System.out.println(key+" "+value);
		}
	
	}

	
}
