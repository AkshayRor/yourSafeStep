package com.safeYourStep.yourSafeStepDTO;

import java.sql.Date;

public class UserSignUpDTO {
	
	private String signUpname;
	private String signUpemailId;
	private String signUpLocation;
	private String signUpPassword;
	private String signUpCurrentCity;
	
	// DTO field for user login DETAILS
	private String loginName;
	private String loginPassword;
	
	
	
	public String getSignUpname() {
		return signUpname;
	}
	public void setSignUpname(String signUpname) {
		this.signUpname = signUpname;
	}
	public String getSignUpemailId() {
		return signUpemailId;
	}
	public void setSignUpemailId(String signUpemailId) {
		this.signUpemailId = signUpemailId;
	}
	public String getSignUpLocation() {
		return signUpLocation;
	}
	public void setSignUpLocation(String signUpLocation) {
		this.signUpLocation = signUpLocation;
	}
	public String getSignUpPassword() {
		return signUpPassword;
	}
	public void setSignUpPassword(String signUpPassword) {
		this.signUpPassword = signUpPassword;
	}
	public String getSignUpCurrentCity() {
		return signUpCurrentCity;
	}
	public void setSignUpCurrentCity(String signUpCurrentCity) {
		this.signUpCurrentCity = signUpCurrentCity;
	}
	
	
	// GETTER AND SETTER METHOD FOR USER LOGIN DETAILS
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	

}
