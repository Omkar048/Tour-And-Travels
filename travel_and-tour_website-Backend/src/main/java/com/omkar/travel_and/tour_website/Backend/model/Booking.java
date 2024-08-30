package com.omkar.travel_and.tour_website.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long bid;
private long uid;
private String whereto,howmany,date,nameanddetails,status;
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}
public Booking(long uid, String whereto, String howmany, String date, String nameanddetails, String status) {
	super();
	this.uid = uid;
	this.whereto = whereto;
	this.howmany = howmany;
	this.date = date;
	this.nameanddetails = nameanddetails;
	this.status = status;
}
public long getBid() {
	return bid;
}
public void setBid(long bid) {
	this.bid = bid;
}
public long getUid() {
	return uid;
}
public void setUid(long uid) {
	this.uid = uid;
}
public String getWhereto() {
	return whereto;
}
public void setWhereto(String whereto) {
	this.whereto = whereto;
}
public String getHowmany() {
	return howmany;
}
public void setHowmany(String howmany) {
	this.howmany = howmany;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getNameanddetails() {
	return nameanddetails;
}
public void setNameanddetails(String nameanddetails) {
	this.nameanddetails = nameanddetails;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}