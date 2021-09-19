package com.wdu.admin.dto;

import com.google.gson.annotations.SerializedName;

public class RazorPayNotes {

	@SerializedName("couponQty")
	private String couponQty;
	@SerializedName("couponName")
	private String couponName;
	@SerializedName("clientUId")
	private String clientUId;
	@SerializedName("paiAmt")
	private String paiAmt;
	@SerializedName("description")
	private String description;
	@SerializedName("couponPrice")
	private String couponPrice;
	@SerializedName("couponId")
	private String couponId;

	public RazorPayNotes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RazorPayNotes(String couponQty, String couponName, String clientUId, String paiAmt, String description,
			String couponPrice, String couponId) {
		super();
		this.couponQty = couponQty;
		this.couponName = couponName;
		this.clientUId = clientUId;
		this.paiAmt = paiAmt;
		this.description = description;
		this.couponPrice = couponPrice;
		this.couponId = couponId;
	}

	public String getCouponQty() {
		return couponQty;
	}

	public void setCouponQty(String couponQty) {
		this.couponQty = couponQty;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getClientUId() {
		return clientUId;
	}

	public void setClientUId(String clientUId) {
		this.clientUId = clientUId;
	}

	public String getPaiAmt() {
		return paiAmt;
	}

	public void setPaiAmt(String paiAmt) {
		this.paiAmt = paiAmt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCouponPrice() {
		return couponPrice;
	}

	public void setCouponPrice(String couponPrice) {
		this.couponPrice = couponPrice;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

}

