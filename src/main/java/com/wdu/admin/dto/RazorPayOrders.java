package com.wdu.admin.dto;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class RazorPayOrders {

	@SerializedName("amount")
	private Integer amount;
	@SerializedName("amount_paid")
	private Integer amountPaid;
	private List<RazorPayNotes> razorPayNotesList;
	@SerializedName("created_at")
	private Integer createdAt;
	@SerializedName("amount_due")
	private Integer amountDue;
	@SerializedName("currency")
	private String currency;
	@SerializedName("receipt")
	private String receipt;
	@SerializedName("id")
	private String id;
	@SerializedName("entity")
	private String entity;
	@SerializedName("offer_id")
	private String offerId;
	@SerializedName("status")
	private String status;
	@SerializedName("attempts")
	private Integer attempts;

	public RazorPayOrders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RazorPayOrders(Integer amount, Integer amountPaid, List<RazorPayNotes> razorPayNotesList, Integer createdAt,
			Integer amountDue, String currency, String receipt, String id, String entity, String offerId, String status,
			Integer attempts) {
		super();
		this.amount = amount;
		this.amountPaid = amountPaid;
		this.razorPayNotesList = razorPayNotesList;
		this.createdAt = createdAt;
		this.amountDue = amountDue;
		this.currency = currency;
		this.receipt = receipt;
		this.id = id;
		this.entity = entity;
		this.offerId = offerId;
		this.status = status;
		this.attempts = attempts;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Integer amountPaid) {
		this.amountPaid = amountPaid;
	}

	public List<RazorPayNotes> getRazorPayNotesList() {
		return razorPayNotesList;
	}

	public void setRazorPayNotesList(List<RazorPayNotes> razorPayNotesList) {
		this.razorPayNotesList = razorPayNotesList;
	}

	public Integer getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Integer createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(Integer amountDue) {
		this.amountDue = amountDue;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getOfferId() {
		return offerId;
	}

	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getAttempts() {
		return attempts;
	}

	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}

}
