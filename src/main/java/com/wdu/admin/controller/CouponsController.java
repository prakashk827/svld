package com.wdu.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdu.admin.service.CouponsService;

@RestController
@RequestMapping("/admin")
public class CouponsController {
	
	@Autowired
	CouponsService couponService;
	@GetMapping("/coupons/couponAnalysis")
	public List<Map<String, Object>>  couponAnalysis() {
		
	
		return couponService.couponAnalysis();
	}
	

}




