package com.wdu.admin.model;

public class ClientProfile {

	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String date;
	private String time;
	private String status;
	private String blocked;
	private String isFilled;
	private String winner;
	private String clientUId;

	public ClientProfile() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBlocked() {
		return blocked;
	}

	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}

	public String getIsFilled() {
		return isFilled;
	}

	public void setIsFilled(String isFilled) {
		this.isFilled = isFilled;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getClientUId() {
		return clientUId;
	}

	public void setClientUId(String clientUId) {
		this.clientUId = clientUId;
	}
	
	

}
