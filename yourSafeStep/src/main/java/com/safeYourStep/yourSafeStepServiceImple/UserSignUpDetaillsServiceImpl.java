package com.safeYourStep.yourSafeStepServiceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safeYourStep.yourSafeStepDAO.UserSignUpDAO;
import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;
import com.safeYourStep.yourSafeStepService.UserSignUpService;

@Service
public class UserSignUpDetaillsServiceImpl  implements UserSignUpService{
	
	@Autowired
	UserSignUpDAO userSignUpDAO;

	
	public UserSignUpDetails saveUserSignUpDetails(UserSignUpDetails userSignUpDetails) {
		return userSignUpDAO.saveUserSignUpDetails(userSignUpDetails);
	
	}

}
