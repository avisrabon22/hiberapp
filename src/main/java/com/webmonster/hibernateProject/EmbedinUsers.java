package com.webmonster.hibernateProject;

import javax.persistence.Embeddable;

@Embeddable
public class EmbedinUsers {
	double phoneNumberl;
	String designation;
	String bloodGroup;
	
	
	//#################################################################
	
	public double getPhoneNumberl() {
		return phoneNumberl;
	}
	public void setPhoneNumberl(double phoneNumberl) {
		this.phoneNumberl = phoneNumberl;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
	//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	
	public EmbedinUsers(double phoneNumberl, String designation, String bloodGroup) {
		super();
		this.phoneNumberl = phoneNumberl;
		this.designation = designation;
		this.bloodGroup = bloodGroup;
	}
	public EmbedinUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
