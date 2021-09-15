package com.wdu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdu.dto.Coupons;
import com.wdu.exception.GenericException;
import com.wdu.service.CouponService;

@RestController
@CrossOrigin(originPatterns = "*")
public class CouponController {

	@Autowired
	CouponService couponService;
	
	@GetMapping("/coupons")
	public List<Coupons> getActiveCoupons() throws GenericException {

		return couponService.getActiveCoupons();

	}

}
