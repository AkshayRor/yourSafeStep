package com.safeYourStep.yourSafeStepService;

import org.springframework.stereotype.Service;

import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;

@Service
public interface UserSignUpService {

	public UserSignUpDetails saveUserSignUpDetails(UserSignUpDetails userSignUpDetails);
}
