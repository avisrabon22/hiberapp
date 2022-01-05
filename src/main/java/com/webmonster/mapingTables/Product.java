package com.webmonster.mapingTables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product {
	@Id
	@Column(name="product_id")
	private int productId;
	private String productName;
	@ManyToOne
	@JoinColumn(name="user_id")
	private UsersPro users;
//	******************************************************************

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersPro getUsers() {
		return users;
	}

	public void setUsers(UsersPro users) {
		this.users = users;
	}

	public Product(int productId, String productName, UsersPro users) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.users = users;
	}

	
	
	
	

}
