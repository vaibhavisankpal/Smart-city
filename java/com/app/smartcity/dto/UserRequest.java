package com.app.smartcity.dto;

import org.springframework.stereotype.Component;

@Component
public class UserRequest {
	private String name;
	private String dob;
	private int age;
	private String address;
	private String password;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRequest [" + (name != null ? "name=" + name + ", " : "") + (dob != null ? "dob=" + dob + ", " : "")
				+ "age=" + age + ", " + (address != null ? "address=" + address + ", " : "")
				+ (email != null ? "email=" + email : "")
				+ (password != null ? "password=" + password : "") + "]";
	}
	
	

}
