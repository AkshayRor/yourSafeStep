package com.safeYourStep.yourSafeStepDAO;

import java.util.List;

import com.safeYourStep.yourSafeStepEntity.UserMaintainData;
import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;

public interface UserLoginDAO {
	
	public List<UserSignUpDetails> getUserLoginDetails();
	
	public List<UserMaintainData> getUserSharedInformationBasedOnStaringAndDestination(String startingPoint, String DestinationPoint);

}
