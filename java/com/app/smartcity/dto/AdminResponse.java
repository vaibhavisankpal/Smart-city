package com.app.smartcity.dto;

import com.app.smartcity.entity.Admin;


public class AdminResponse {
	private Admin response;
	private String status;
	public Admin getResponse() {
		return response;
	}
	public void setResponse(Admin response) {
		this.response = response;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public AdminResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminResponse(Admin response, String status) {
		super();
		this.response = response;
		this.status = status;
	}
	@Override
	public String toString() {
		return "AdminResponse [response=" + response + ", status=" + status + "]";
	}

}
