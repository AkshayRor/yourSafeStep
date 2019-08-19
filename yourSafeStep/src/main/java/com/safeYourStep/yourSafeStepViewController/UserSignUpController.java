package com.safeYourStep.yourSafeStepViewController;



import java.sql.Date;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.safeYourStep.yourSafeStepDTO.UserSignUpDTO;
import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;
import com.safeYourStep.yourSafeStepService.UserSignUpService;

@Controller
public class UserSignUpController {
	
	@Autowired
	UserSignUpService userSignUpService ;
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}

	@RequestMapping(value="/userSignUpDetails" , method = RequestMethod.POST)
	public ModelAndView userSignupDetails(UserSignUpDTO userSignUpDTO ,HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		try {
			// for getting the current date and time
			
			UserSignUpDetails userSignUpDetails = new UserSignUpDetails();
			userSignUpDetails.setCreatedDate(new java.util.Date());
			userSignUpDetails.setUserSignUpEmailID(userSignUpDTO.getSignUpemailId());
			userSignUpDetails.setUserSignUpName(userSignUpDTO.getSignUpname());
			userSignUpDetails.setUserSignUpPassword(userSignUpDTO.getSignUpPassword());
			userSignUpDetails.setUserSignUpLocation(userSignUpDTO.getSignUpLocation());
			userSignUpService.saveUserSignUpDetails(userSignUpDetails);
			model.setViewName("showInformation");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value = "/getInformation")
	public ModelAndView getUserChoiceInformation(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView model = new ModelAndView();
		model.setViewName("showInformation");
		return model;
	}
	
}
