package com.app.smartcity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Business {
	@Id
	private String name;
	private String type;
	private String year;
	private double budget;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Business(String name, String type, String year, double budget) {
		super();
		this.name = name;
		this.type = type;
		this.year = year;
		this.budget = budget;
	}
	

}
