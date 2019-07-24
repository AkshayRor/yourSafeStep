package com.safeYourStep.yourSafeStepService;

import org.springframework.stereotype.Service;

import com.safeYourStep.yourSafeStepEntity.UserMaintainData;
import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;

@Service
public interface UserSignUpService {

	public UserSignUpDetails saveUserSignUpDetails(UserSignUpDetails userSignUpDetails);
	
	public UserMaintainData saveUserJourneyExperience(UserMaintainData userMaintainData);
}
