package com.wdu.admin.dto;

import com.google.gson.annotations.SerializedName;

public class RazorpayPayments {

	@SerializedName("captured")
	private Boolean captured;
	@SerializedName("notes")
	private RazorPayNotes razorPayNotes;
	@SerializedName("id")
	private String paymentId;

	public RazorpayPayments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boolean getCaptured() {
		return captured;
	}

	public void setCaptured(Boolean captured) {
		this.captured = captured;
	}

	public RazorPayNotes getRazorPayNotes() {
		return razorPayNotes;
	}

	public void setRazorPayNotes(RazorPayNotes razorPayNotes) {
		this.razorPayNotes = razorPayNotes;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

}
