package com.wdu.admin.dto;

public class AppTitle {

	private String title;
	private String appIcon;
	private String appTitle;
	private String appSubTitle;
	private String appLink;

	public AppTitle() {
		super();

	}

	public AppTitle(String title, String appIcon, String appTitle, String appSubTitle, String appLink) {
		super();
		this.title = title;
		this.appIcon = appIcon;
		this.appTitle = appTitle;
		this.appSubTitle = appSubTitle;
		this.appLink = appLink;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAppIcon() {
		return appIcon;
	}

	public void setAppIcon(String appIcon) {
		this.appIcon = appIcon;
	}

	public String getAppTitle() {
		return appTitle;
	}

	public void setAppTitle(String appTitle) {
		this.appTitle = appTitle;
	}

	public String getAppSubTitle() {
		return appSubTitle;
	}

	public void setAppSubTitle(String appSubTitle) {
		this.appSubTitle = appSubTitle;
	}

	public String getAppLink() {
		return appLink;
	}

	public void setAppLink(String appLink) {
		this.appLink = appLink;
	}

}
