package com.wdu.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdu.admin.dto.AppTitle;


@Controller
@RequestMapping("/admin")
public class AdminHomePageController {
	
	@Autowired 
	CouponsController couponsController;
	
	@RequestMapping("/coupons/coupon-analysis")
	public String couponAnalysis(Model model) {
		
		AppTitle appTitle = new AppTitle();
		
		appTitle.setAppTitle("Coupon Analysis");
		appTitle.setAppIcon("<i class='fa fa-tags'></i>");
		appTitle.setAppTitle("Coupon Analysis");
		appTitle.setAppSubTitle("Table to display analytical data effectively");
		appTitle.setAppLink("#");
		
		model.addAttribute("appTitle",appTitle);
		model.addAttribute("couponAnalysis",couponsController.couponAnalysis());
		model.addAttribute("couponIds", couponsController.getCouponId());
		return "admin/coupon_analysis";
	}
	

}


