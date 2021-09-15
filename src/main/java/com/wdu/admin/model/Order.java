
package com.wdu.admin.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "amount", "amount_paid", "notes", "created_at", "amount_due", "currency", "receipt", "id",
		"entity", "offer_id", "status", "attempts" })
@Generated("jsonschema2pojo")
public class Order {

	@JsonProperty("amount")
	private Integer amount;
	@JsonProperty("amount_paid")
	private Integer amountPaid;
	@JsonProperty("notes")
	private List<Object> notes = null;
	@JsonProperty("created_at")
	private Integer createdAt;
	@JsonProperty("amount_due")
	private Integer amountDue;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("receipt")
	private String receipt;
	@JsonProperty("id")
	private String id;
	@JsonProperty("entity")
	private String entity;
	@JsonProperty("offer_id")
	private Object offerId;
	@JsonProperty("status")
	private String status;
	@JsonProperty("attempts")
	private Integer attempts;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("amount")
	public Integer getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@JsonProperty("amount_paid")
	public Integer getAmountPaid() {
		return amountPaid;
	}

	@JsonProperty("amount_paid")
	public void setAmountPaid(Integer amountPaid) {
		this.amountPaid = amountPaid;
	}

	@JsonProperty("notes")
	public List<Object> getNotes() {
		return notes;
	}

	@JsonProperty("notes")
	public void setNotes(List<Object> notes) {
		this.notes = notes;
	}

	@JsonProperty("created_at")
	public Integer getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(Integer createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("amount_due")
	public Integer getAmountDue() {
		return amountDue;
	}

	@JsonProperty("amount_due")
	public void setAmountDue(Integer amountDue) {
		this.amountDue = amountDue;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("receipt")
	public String getReceipt() {
		return receipt;
	}

	@JsonProperty("receipt")
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("entity")
	public String getEntity() {
		return entity;
	}

	@JsonProperty("entity")
	public void setEntity(String entity) {
		this.entity = entity;
	}

	@JsonProperty("offer_id")
	public Object getOfferId() {
		return offerId;
	}

	@JsonProperty("offer_id")
	public void setOfferId(Object offerId) {
		this.offerId = offerId;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("attempts")
	public Integer getAttempts() {
		return attempts;
	}

	@JsonProperty("attempts")
	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}