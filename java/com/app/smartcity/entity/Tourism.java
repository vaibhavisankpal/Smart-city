package com.app.smartcity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tourism {
 @Id
 private int id;
 private String name;
 private String place;
 private int days;
 private int ticket;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
public int getTicket() {
	return ticket;
}
public void setTicket(int ticket) {
	this.ticket = ticket;
}
@Override
public String toString() {
	return "Tourism [id=" + id + ", name=" + name + ", place=" + place + ", days=" + days + ", ticket=" + ticket + "]";
}
public Tourism(int id, String name, String place, int days, int ticket) {
	super();
	this.id = id;
	this.name = name;
	this.place = place;
	this.days = days;
	this.ticket = ticket;
}
public Tourism() {
	super();
	// TODO Auto-generated constructor stub
}

	
}
