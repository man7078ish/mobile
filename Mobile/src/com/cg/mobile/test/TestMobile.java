package com.cg.mobile.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.cg.mobile.bean.Mobile_info;
import com.cg.mobile.dao.mobileDao;
import com.cg.mobile.dao.mobileRepo;
import com.cg.mobile.exception.MobilePurchaseException;
import com.cg.mobile.service.MobileServiceImpl;
import com.cg.mobile.service.mobileService;

public class TestMobile {
	mobileDao obj=new mobileDao();
	
mobileService ms=new MobileServiceImpl(obj);

	@Test(expected=MobilePurchaseException.class)
	public void test() throws MobilePurchaseException {
		HashMap<Integer,Mobile_info>hm2=obj.hm1;
		ms.validate_count(hm2, );
		fail("Not yet implemented");
	}

}
