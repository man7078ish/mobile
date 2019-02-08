package com.cg.mobileapp.ui;
import com.cg.mobileapp.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.mobileapp.bean.Customer;
import com.cg.mobileapp.dao.ShowMobDetails;
import com.cg.mobileapp.service.Customerdetails;
import com.cg.mobileapp.util.Mobiledetails;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobiledetails m1=new Mobiledetails();
		m1.AddmobDetails();
		m1.ShowList();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.next();
		System.out.println("enter your mailid");
		String mailid=s.next();
		System.out.println("enter your mobileid");
		int mobileid=s.nextInt();
		
	Customer c=new Customer(name, mailid, mobileid);
	Customerdetails cd=new Customerdetails();
	cd.AddCustDetail(c);
    cd.show();
    cd.purchase(m1.h1,cd.h2);
		

	}

}
