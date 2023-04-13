package com.app.smartcity.dto;

import com.app.smartcity.entity.User;

public class UserResponse {
	private User response;
	private String status;
	public User getResponse() {
		return response;
	}
	public void setResponse(User response) {
		this.response = response;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserResponse(User response, String status) {
		super();
		this.response = response;
		this.status = status;
	}
	@Override
	public String toString() {
		return "UserResponse [" + (response != null ? "response=" + response + ", " : "")
				+ (status != null ? "status=" + status : "") + "]";
	}
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
