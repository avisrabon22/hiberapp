package com.webmonster.mapingTables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UsersPro {
	@Id
	@Column(name = "user_Id")
	private int userID;
	private String username;
	@OneToOne
	@JoinColumn(name = "prod_id")
	private Product prod;

//	#####################################################
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public UsersPro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersPro(int userID, String username) {
		super();
		this.userID = userID;
		this.username = username;
	}

}
