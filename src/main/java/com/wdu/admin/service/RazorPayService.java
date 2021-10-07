package com.wdu.admin.service;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.razorpay.Order;
import com.razorpay.Payment;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.wdu.admin.dto.RazorPayOrders;
import com.wdu.admin.dto.RazorpayPayments;
import com.wdu.admin.repository.RazorPayRepository;
import com.wdu.exception.GenericException;

@Service

public class RazorPayService {

	@Autowired
	RazorPayRepository razorPayRepository;

	public RazorPayOrders[] getOrders() throws RazorpayException {
		List<Order> orders = null;

		RazorPayOrders[] ordersList = null;
		RazorpayClient razorpay = new RazorpayClient("rzp_test_dNYs2vEQKMjA1R", "Cmad9esZbPU5lUpgHQx8i014");
		try {

			JSONObject orderRequest = new JSONObject();

			// supported option filters (from, to, count, skip)
			orderRequest.put("count", 10);
			orderRequest.put("skip", 1);

			orders = razorpay.Orders.fetchAll(orderRequest);

			// System.out.println(orders);

			final GsonBuilder gsonBuilder = new GsonBuilder();
			final Gson gson = gsonBuilder.create();
			ordersList = gson.fromJson(orders.toString(), RazorPayOrders[].class);

			for (RazorPayOrders order : ordersList) {

				System.out.println(order.getRazorPayNotesList());
			}

		} catch (RazorpayException e) {
			// Handle Exception
			System.out.println(e.getMessage());
		}

		return ordersList;
	}

	public List<String> getRazorPayPayments() throws RazorpayException, GenericException {
		List<String> logList = null;
		
		RazorpayPayments[] paymentstList = null;
		// Test mode prakash
		// rzp_test_dNYs2vEQKMjA1R
		// Cmad9esZbPU5lUpgHQx8i014
		RazorpayClient razorpay = new RazorpayClient("rzp_live_3fu80DFDiZbJ4L", "QGD8GQZffFcyLRgy1Yv4heNz");
		try {
			JSONObject paymentRequest = new JSONObject();

			// supported option filters (from, to, count, skip)
			paymentRequest.put("count", 99);
			paymentRequest.put("skip", 1);

			List<Payment> payments = razorpay.Payments.fetchAll(paymentRequest);

			System.out.println(payments);
			final GsonBuilder gsonBuilder = new GsonBuilder();
			final Gson gson = gsonBuilder.create();

			paymentstList = gson.fromJson(payments.toString(), RazorpayPayments[].class);
			// System.out.println(paymentstList);

			for (RazorpayPayments payment : paymentstList) {

				 logList =  razorPayRepository.updateRazorPayPayments(payment);
			}

		} catch (RazorpayException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return logList;

	}

}
