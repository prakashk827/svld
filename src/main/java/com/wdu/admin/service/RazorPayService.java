package com.wdu.admin.service;

import java.util.List;
import com.razorpay.Order;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service

public class RazorPayService {
	
	public List<Order> getOrders() throws RazorpayException {
		List<Order> orders = null;
		
		
		
		RazorpayClient razorpay = new RazorpayClient("rzp_live_3fu80DFDiZbJ4L", "QGD8GQZffFcyLRgy1Yv4heNz");
		try {
		 
			JSONObject orderRequest = new JSONObject();

		  // supported option filters (from, to, count, skip)
		  orderRequest.put("count", 1);
		  orderRequest.put("skip", 1);

		 orders = razorpay.Orders.fetchAll(orderRequest);
		  System.out.println(orders);
		} catch (RazorpayException e) {
		  // Handle Exception
		  System.out.println(e.getMessage());
		}
		
		return null;
	}

}
