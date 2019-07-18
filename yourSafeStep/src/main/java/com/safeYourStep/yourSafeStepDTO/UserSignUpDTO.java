package com.safeYourStep.yourSafeStepDTO;

import java.sql.Date;

public class UserSignUpDTO {
	
	private String signUpname;
	private String signUpemailId;
	private String signUpLocation;
	private String signUpPassword;
	private String signUpCurrentCity;
	
	
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
	
	

}
