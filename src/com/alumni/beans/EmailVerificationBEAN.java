package com.alumni.beans;

import java.util.Date;

public class EmailVerificationBEAN {

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPassyrId() {
		return PassyrId;
	}

	public void setPassyrId(int passyrId) {
		PassyrId = passyrId;
	}

	public int getBranchId() {
		return BranchId;
	}

	public void setBranchId(int branchId) {
		BranchId = branchId;
	}

	public String getEnrno() {
		return Enrno;
	}

	public void setEnrno(String enrno) {
		Enrno = enrno;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMailSent() {
		return mailSent;
	}

	public void setMailSent(String mailSent) {
		this.mailSent = mailSent;
	}

	
	private boolean success;
	
	private String Fname;
	private String Lname;
	private String gender;
	private Date dob;
	private String Email;
	private int PassyrId;
	private int BranchId;
	private String Enrno;
	private String token;
	private String code;
	private String mailSent;
	private boolean network;
	public boolean isNetwork() {
		return network;
	}

	public void setNetwork(boolean network) {
		this.network = network;
	}
}
