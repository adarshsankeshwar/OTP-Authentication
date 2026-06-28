package com.kodnest.OTPAuthentication;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Userotp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String otp;
	@Column
	String userid;
	
	public Userotp() {
		
	}

	public Userotp(int id, String otp, String userid) {
		super();
		this.id = id;
		this.otp = otp;
		this.userid = userid;
	}

	

	public Userotp(String otp, String userid) {
	    this.otp = otp;
	    this.userid = userid;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
}
