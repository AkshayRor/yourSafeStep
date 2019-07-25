package com.safeYourStep.yourSafeStepRestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.safeYourStep.yourSafeStepDTO.UserGetInformationDTO;
import com.safeYourStep.yourSafeStepService.UserLoginService;

@RestController
public class UserGetInformationRestController {
	
	@Autowired
	UserLoginService userLoginService;

	
	@RequestMapping(value = "/getUserShareInformation", method = RequestMethod.POST)
	public boolean getUserInformation(UserGetInformationDTO userGetInformationDTO, HttpServletRequest req, HttpServletResponse res) {
		boolean value = false;
		String startingPoint    = userGetInformationDTO.getUserStartingPoint();
		String DestinationPoint = userGetInformationDTO.getUserDestinationPoint(); 
		userLoginService.getUserSharedInformationBasedOnStaringAndDestination(startingPoint, DestinationPoint);
		return value;
	}
}
