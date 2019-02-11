package com.cg.mobile.bean;
import com.cg.mobile.dao.*;
import com.cg.mobile.service.MobileServiceImpl;
import com.cg.mobile.service.mobileService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;




public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	mobileDao obj1=new mobileDao();
	HashMap<Integer,Mobile_info> hm1=(HashMap<Integer, Mobile_info>) obj1.hm1;
	obj1.show(hm1);
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter mobile id");
	int mobileId=scanner.nextInt();
	mobileService obj2=new MobileServiceImpl(obj1);
	obj2.validate_count( hm1, mobileId);
	Scanner s=new Scanner(System.in);
	int mobno=s.nextInt();
	mobileDao obj11=new mobileDao();
	MobileServiceImpl obj=new MobileServiceImpl(obj11);
	container cont=new container();
	
	obj.validate_mob(mobno, hm1,mobileId);
	String name=scanner.nextLine();
	scanner.nextLine();
	System.out.println("enter phone no.");
	long phn=scanner.nextLong();
	Purchase_details pd=new Purchase_details(name, phn, mobileId);
	container create=new container();
	HashMap<Integer,Purchase_details> hm2=create.purchase(pd);
	create.addPurchaseDetails(mobno, hm1, hm2);
	
	}

}

