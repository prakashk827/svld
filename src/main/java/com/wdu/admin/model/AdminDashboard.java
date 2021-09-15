package com.wdu.admin.model;

public class AdminDashboard {

	private String activeClients;
	private String totalCoupons;
	private String soldCoupons;
	private String targetProfit;
	private String reachedProfit;
	private String totalWinner;

	public AdminDashboard() {
		super();
	
	}

	public String getActiveClients() {
		return activeClients;
	}

	public void setActiveClients(String activeClients) {
		this.activeClients = activeClients;
	}

	public String getTotalCoupons() {
		return totalCoupons;
	}

	public void setTotalCoupons(String totalCoupons) {
		this.totalCoupons = totalCoupons;
	}

	public String getSoldCoupons() {
		return soldCoupons;
	}

	public void setSoldCoupons(String soldCoupons) {
		this.soldCoupons = soldCoupons;
	}

	public String getTargetProfit() {
		return targetProfit;
	}

	public void setTargetProfit(String targetProfit) {
		this.targetProfit = targetProfit;
	}

	public String getReachedProfit() {
		return reachedProfit;
	}

	public void setReachedProfit(String reachedProfit) {
		this.reachedProfit = reachedProfit;
	}

	public String getTotalWinner() {
		return totalWinner;
	}

	public void setTotalWinner(String totalWinner) {
		this.totalWinner = totalWinner;
	}

}
