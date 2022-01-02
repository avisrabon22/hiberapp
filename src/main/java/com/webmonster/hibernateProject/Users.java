package com.webmonster.hibernateProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length = 30, nullable = false)
	private String fullname;

	@Column(length = 30, nullable = false)
	private String email;

	@Column(nullable = false, length = 30)
	private String password;

	@Lob
	private byte[] image;

	private EmbedinUsers embed;

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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public EmbedinUsers getEmbed() {
		return embed;
	}

	public void setEmbed(EmbedinUsers embed) {
		this.embed = embed;
	}

	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public Users(int id, String fullname, String email, String password, byte[] image) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.image = image;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "id=" + this.id + ", fullname=" + this.fullname + ", email=" + this.email + ", password=" + this.password
				+ ", Phone number:" + this.embed.phoneNumberl + ", Designation:" + this.embed.designation + ", Blood Group:"
				+ this.embed.bloodGroup;
	}

}
