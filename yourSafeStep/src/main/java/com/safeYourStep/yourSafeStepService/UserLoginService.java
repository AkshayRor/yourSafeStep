package com.safeYourStep.yourSafeStepService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;

@Service
public interface UserLoginService {
	
	public List<UserSignUpDetails> getUserLoginDetails();

}
