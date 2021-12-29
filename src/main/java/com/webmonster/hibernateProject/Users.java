package com.webmonster.hibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	private int id;
	private String fullname;
	private String email;
	private String password;
	
//***************************************************************************
public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	//	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public Users(int id, String fullname, String email, String password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
	}


	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
