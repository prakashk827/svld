package com.wdu.admin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.razorpay.RazorpayException;
import com.wdu.admin.dto.RazorPayOrders;
import com.wdu.admin.service.RazorPayService;
import com.wdu.exception.GenericException;

@RestController
public class RazorPayController {

	@Autowired
	RazorPayService service;

	@GetMapping("/orders")
	public RazorPayOrders[] getRazorPayOrders()
			throws RazorpayException, JsonMappingException, JsonProcessingException {
		return service.getOrders();
	}

	// 15 min schedule
	@Scheduled(initialDelay = 600000, fixedDelay = 600000)
	@GetMapping("/payments")
	public List<String> getRazorPayPayments() throws RazorpayException, GenericException {
		System.out.println("Payment status update in running mode....." + new Date());
		return service.getRazorPayPayments();
	}

}
