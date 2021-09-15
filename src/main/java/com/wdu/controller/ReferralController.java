package com.wdu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdu.model.MyReferrals;

@RestController
public class ReferralController {

	@GetMapping("/ref")
	public List<MyReferrals> get() {

		List<MyReferrals> list = new ArrayList<MyReferrals>();
		
		MyReferrals ref1 = new MyReferrals();

		ref1.setName("Amit S");
		ref1.setPoints(100);
		ref1.setStatus("Approved");
		list.add(ref1);

		MyReferrals ref2 = new MyReferrals();

		ref2.setName("Narendra M");
		ref2.setPoints(0);
		ref2.setStatus("Pending");
		list.add(ref2);
		
		MyReferrals ref3 = new MyReferrals();

		ref3.setName("Yogi");
		ref3.setPoints(100);
		ref3.setStatus("Approved");
		
		list.add(ref3);
		
		
		return list;

	}

}
