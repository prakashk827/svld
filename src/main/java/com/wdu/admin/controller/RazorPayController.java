package com.wdu.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.razorpay.Order;
import com.razorpay.RazorpayException;
import com.wdu.admin.service.RazorPayService;

@RestController
public class RazorPayController {
	
	@Autowired 
	RazorPayService service;
	@GetMapping("/orders")
	public List<Order> getRazorPayOrders() throws RazorpayException, JsonMappingException, JsonProcessingException {
		return service.getOrders();
		
		
		
	}

}
