package com.wdu.admin.model;

public class CouponsSold {

	private int id;
	private String time;
	private String date;
	private String clientUId;
	private String couponId;
	private String luckyNumber;
	private String paymentStatus;
	private String boughtOn;
	private String boughtQty;
	private String paidAmt;
	private String transactionId;
	private String status;

	public CouponsSold() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getClientUId() {
		return clientUId;
	}

	public void setClientUId(String clientUId) {
		this.clientUId = clientUId;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getLuckyNumber() {
		return luckyNumber;
	}

	public void setLuckyNumber(String luckyNumber) {
		this.luckyNumber = luckyNumber;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getBoughtOn() {
		return boughtOn;
	}

	public void setBoughtOn(String boughtOn) {
		this.boughtOn = boughtOn;
	}

	public String getBoughtQty() {
		return boughtQty;
	}

	public void setBoughtQty(String boughtQty) {
		this.boughtQty = boughtQty;
	}

	public String getPaidAmt() {
		return paidAmt;
	}

	public void setPaidAmt(String paidAmt) {
		this.paidAmt = paidAmt;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
