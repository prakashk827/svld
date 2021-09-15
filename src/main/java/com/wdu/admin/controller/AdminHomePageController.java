package com.wdu.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminHomePageController {
	
	@Autowired 
	CouponsController couponsController;
	
	@RequestMapping("/coupons/coupon-analysis")
	public String couponAnalysis(Model model) {
		model.addAttribute("couponAnalysis",couponsController.couponAnalysis());
		return "admin/coupon_analysis";
	}
	

}


