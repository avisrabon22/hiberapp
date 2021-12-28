package com.webmonster.hibernateProject;

public class Users {

	private int id;
	private String fullname;
	private String email;
	private String password;
	
	
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
	
	
	
}
