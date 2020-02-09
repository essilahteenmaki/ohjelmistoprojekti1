package com.example.ohjelmistoprojekti1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userid;
	
	@NotNull(message="Anna etunimi")
	private String firstname;
	
	@NotNull(message="Anna sukuniminimi")
	private String lastname;
	
	@NotNull(message="Anna puhelinnumero")
	private String phonenumber;
	
	@NotNull(message="Anna sähköpostiosoite")
	private String email;

	public User() {
		super();
		
	}

	public User(long userid, String firstname, String lastname, String phonenumber,
		 String email) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.email = email;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", phonenumber="
				+ phonenumber + ", email=" + email + "]";
	}
	
	
	
	
	

}
