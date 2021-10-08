package com.wdu.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdu.admin.service.CouponsService;
import com.wdu.dto.ApiResponse;

@RestController
@RequestMapping("/admin")
public class CouponsController {

	@Autowired
	CouponsService couponService;

	@GetMapping("/coupons/couponAnalysis")
	public ApiResponse  couponAnalysis() {
		
		List<Map<String, Object>> response = couponService.couponAnalysis();
		ApiResponse apiResponse =  new ApiResponse();
				
		if( response == null || response.isEmpty()) {
			
			apiResponse.setCode(HttpStatus.NO_CONTENT.value());
			apiResponse.setMessage("No records found");
			return apiResponse;
		} 
		
		apiResponse.setCode(HttpStatus.OK.value());
		apiResponse.setResponse(response);
		return apiResponse;
	}
	
	@GetMapping("/coupons/couponId")
	public List<Map<String, Object>> getCouponIdAndNames(){
		
		return couponService.getCouponIdAndNames();
		
		
	}

}
