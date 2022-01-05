package com.webmonster.mapingTables;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UsersPro {
	@Id
	@Column(name = "user_Id")
	private int userID;
	private String username;

	@OneToMany(mappedBy = "users")
	private List<Product> prods;

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

	public List<Product> getProds() {
		return prods;
	}

	public void setProds(List<Product> prods) {
		this.prods = prods;
	}

	public UsersPro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersPro(int userID, String username, List<Product> prods) {
		super();
		this.userID = userID;
		this.username = username;
		this.prods = prods;
	}

}
