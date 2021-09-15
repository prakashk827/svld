package com.wdu.model;

public class User extends CommonEntity {

	private int id;
	private String clientUId;
	private String firstName;
	private String lastName;
	private String password;
	private String image = "profile.png";
	private String status = "active";
	private String winner = "no";
	private String blocked = "no";
	private String isFilled = "yes";

	public User() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientUId() {
		return clientUId;
	}

	public void setClientUId(String clientUId) {
		this.clientUId = clientUId;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
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

}
