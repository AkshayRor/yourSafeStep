package com.safeYourStep.yourSafeStepDAO;

import com.safeYourStep.yourSafeStepEntity.UserMaintainData;
import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;

public interface UserSignUpDAO {
	
	UserSignUpDetails saveUserSignUpDetails(UserSignUpDetails userSignUpDetails);

	public UserMaintainData saveUserJourneyExperience(UserMaintainData userMaintainData);
}
