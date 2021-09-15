package com.wdu.model;

import java.util.List;

public class Referral {
	
	private String referralCode;
	private int earnedPoints;
	private List<MyReferrals> list;
	
	public String getReferralCode() {
		return referralCode;
	}
	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}
	public int getEarnedPoints() {
		return earnedPoints;
	}
	public void setEarnedPoints(int earnedPoints) {
		this.earnedPoints = earnedPoints;
	}
	public List<MyReferrals> getList() {
		return list;
	}
	public void setList(List<MyReferrals> list) {
		this.list = list;
	}
	
	
	

}
