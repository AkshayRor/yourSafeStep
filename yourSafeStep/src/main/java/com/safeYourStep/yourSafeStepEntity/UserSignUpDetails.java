package com.safeYourStep.yourSafeStepEntity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="UserSignUpDetails")
public class UserSignUpDetails {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	
	@Column(name ="User_SignUp_Name")
	private String userSignUpName;
	
	@Column(name = "User_SignUp_EmailID")
	private String userSignUpEmailID;
	
	@Column(name = "User_SignUp_Location")
	private String userSignUpLocation;
	
	@Column(name = "User_SignUp_Password")
	private String userSignUpPassword;
	
	@Column(name = "User_SignUp_CurrentCity")
	private String userSignUpCurrentCity;
	
	@Column(name = "Created_Date")
	private Date createdDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserSignUpName() {
		return userSignUpName;
	}

	public void setUserSignUpName(String userSignUpName) {
		this.userSignUpName = userSignUpName;
	}

	public String getUserSignUpEmailID() {
		return userSignUpEmailID;
	}

	public void setUserSignUpEmailID(String userSignUpEmailID) {
		this.userSignUpEmailID = userSignUpEmailID;
	}

	public String getUserSignUpLocation() {
		return userSignUpLocation;
	}

	public void setUserSignUpLocation(String userSignUpLocation) {
		this.userSignUpLocation = userSignUpLocation;
	}

	public String getUserSignUpPassword() {
		return userSignUpPassword;
	}

	public void setUserSignUpPassword(String userSignUpPassword) {
		this.userSignUpPassword = userSignUpPassword;
	}

	public String getUserSignUpCurrentCity() {
		return userSignUpCurrentCity;
	}

	public void setUserSignUpCurrentCity(String userSignUpCurrentCity) {
		this.userSignUpCurrentCity = userSignUpCurrentCity;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.util.Date date) {
		this.createdDate = (Date) date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
