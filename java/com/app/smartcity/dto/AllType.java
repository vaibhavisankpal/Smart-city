package com.app.smartcity.dto;

import java.util.List;

import com.app.smartcity.entity.Admin;
import com.app.smartcity.entity.Business;
import com.app.smartcity.entity.City;
import com.app.smartcity.entity.Places;
import com.app.smartcity.entity.Tourism;
import com.app.smartcity.entity.User;


public class AllType {
	private List<User> users;
	private List<City> cities;
	private List<Admin>admin;
	private List<Business>business;
	public List<Places> place;
	public List<Tourism> tourism;
	public AllType(List<User> findAll, List<Admin> findAll2, List<City> findAll3, List<Business> findAll4,
			List<Places> findAll5, List<Tourism> findAll6) {
		// TODO Auto-generated constructor stub
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public List<Admin> getAdmin() {
		return admin;
	}
	public void setAdmin(List<Admin> admin) {
		this.admin = admin;
	}
	public List<Business> getBusiness() {
		return business;
	}
	public void setBusiness(List<Business> business) {
		this.business = business;
	}
	public List<Places> getPlace() {
		return place;
	}
	public void setPlace(List<Places> place) {
		this.place = place;
	}
	public List<Tourism> getTourism() {
		return tourism;
	}
	public void setTourism(List<Tourism> tourism) {
		this.tourism = tourism;
	}

	@Override
	public String toString() {
		return "AllType [users=" + users + ", cities=" + cities + ", admin=" + admin + ", business=" + business
				+ ", place=" + place + ", tourism=" + tourism + "]";
	}
	
	

}
