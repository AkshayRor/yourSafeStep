package com.safeYourStep.yourSafeStepServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safeYourStep.yourSafeStepDAO.UserLoginDAO;
import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;
import com.safeYourStep.yourSafeStepService.UserLoginService;



@Service
public class UserLoginServiceImpl implements UserLoginService{
		
	@Autowired
	UserLoginDAO userLoginDAO;
	
	public List<UserSignUpDetails> getUserLoginDetails() {
		return userLoginDAO.getUserLoginDetails();
	}

}