package com.wdu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdu.dto.MyObj;

@Controller
public class HomeController {

	
	@RequestMapping("/bishnu")
	public String showMyPage(Model model) {
		
		MyObj obj = new MyObj();
		
		obj.setMyName("Veerendra");
		obj.setMyFriendName("Bishnu Prasad");
		obj.setMyLectureName("Ram Sir");
		
		List<String> cityList = new ArrayList<>();
		
		cityList.add("Banglore");
		cityList.add("Mysore");
		cityList.add("Odissa");
		
		model.addAttribute("cities", cityList);
		return "hellowWorld";
	}
}
