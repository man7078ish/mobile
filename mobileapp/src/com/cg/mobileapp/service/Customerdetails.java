package com.cg.mobileapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.mobileapp.bean.Customer;
import com.cg.mobileapp.bean.Mobile;

public class Customerdetails implements CustDetail {
	public HashMap<Integer,Customer> h2=new HashMap();
	@Override
	public Map AddCustDetail(Customer c) {
		// TODO Auto-generated method stub
		int Orderid=100;
		ArrayList<Customer> al=new ArrayList();
		al.add(c);
		
		for(int i=0;i<al.size();i++)
		{
			h2.put(Orderid, al.get(i));
			Orderid++;
			
		}
		return h2;
		

}
	public void show()
	{

		for(Integer i:h2.keySet())
		{
		String key=i.toString();
		String value=h2.get(i).toString();
		System.out.println(key+" "+value);
		}
	}

	@Override
	public void purchase(HashMap<Integer,Mobile> h1,HashMap<Integer,Customer> h2) {
		// TODO Auto-generated method stub
		int link=0;
		int key2=0;
		for(Integer key1:h2.keySet())
		{
			Customer cd1=h2.get(key1);
			link=cd1.getMobileid();
			key2=key1;
		}
		int count=h1.get(link).getQuality();
		count=count-1;
		h1.get(link).setQuality(count);
		
			System.out.println(link+" "+h1.get(link)+" "+key2+" "+h2.get(key2));
	}
	

}
