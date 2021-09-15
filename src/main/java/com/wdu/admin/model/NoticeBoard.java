package com.wdu.admin.model;

public class NoticeBoard {

	private int id;
	private String couponName;
	private String announceDate;
	private String announceTime;
	private String comment;
	private String status = "active";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getAnnounceDate() {
		return announceDate;
	}

	public void setAnnounceDate(String announceDate) {
		this.announceDate = announceDate;
	}

	public String getAnnounceTime() {
		return announceTime;
	}

	public void setAnnounceTime(String announceTime) {
		this.announceTime = announceTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
