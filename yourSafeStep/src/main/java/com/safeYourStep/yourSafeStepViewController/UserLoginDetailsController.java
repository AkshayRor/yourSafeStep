package com.safeYourStep.yourSafeStepViewController;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.safeYourStep.yourSafeStepDTO.UserGetInformationDTO;
import com.safeYourStep.yourSafeStepDTO.UserSignUpDTO;
import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;
import com.safeYourStep.yourSafeStepService.UserLoginService;

@Controller
public class UserLoginDetailsController {
	
	@Autowired
	UserLoginService userLoginService;
	
	/** 
	 *  This request mapping value will fetch the user login details and 
	 *  go to the information page
	 *  
	 * */
	@RequestMapping(value = "/userLoginDetails", method = RequestMethod.POST)
	public ModelAndView userLoginDetails(UserSignUpDTO userSignUpDTO, HttpServletRequest req, HttpServletResponse res) {
		ModelAndView model = new ModelAndView();
		try {
			List<UserSignUpDetails> userSignUpDetailsList = new ArrayList<UserSignUpDetails>();
			String userLoginName = userSignUpDTO.getLoginName();
			String userLoginPassword = userSignUpDTO.getLoginPassword();
			userSignUpDetailsList = userLoginService.getUserLoginDetails();
			for(UserSignUpDetails userList: userSignUpDetailsList) {
				if(userList.getUserSignUpName().equals(userLoginName) && userList.getUserSignUpPassword().equals(userLoginPassword)) {
					model.addObject("userLoginName",userLoginName);
					model.setViewName("showInformation");
					break;
				}else {
					model.setViewName("errorPage");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	
	/**
	 * this request mapping value will fetch the user get Information
	 * 
	 * **/
	@RequestMapping(value ="/getUserInformation", method = RequestMethod.POST)
	public ModelAndView getUserInformation(UserGetInformationDTO userGetInformationDTO, HttpServletRequest req, HttpServletResponse res) {
		ModelAndView model = new ModelAndView();
		
		return model;
	}

}
