package com.safeYourStep.yourSafeStepDaoImple;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.safeYourStep.yourSafeStepDAO.UserLoginDAO;
import com.safeYourStep.yourSafeStepEntity.UserMaintainData;
import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;
import com.safeYourStep.yourSafeStepViewController.UserLoginDetailsController;


@Repository
@Transactional
@SuppressWarnings("unused")
public class UserLoginDaoImpl implements UserLoginDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<UserSignUpDetails> getUserLoginDetails() {
		
		Session session = this.sessionFactory.getCurrentSession();
		List<UserSignUpDetails> userSignUpDetailsList = new ArrayList<UserSignUpDetails>();
		try {
			String query = "from UserSignUpDetails";
		    userSignUpDetailsList = session.createQuery(query).list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return userSignUpDetailsList;
	}
	
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<UserMaintainData> getUserSharedInformationBasedOnStaringAndDestination(String startingPoint, String DestinationPoint){
		
		Session session = this.sessionFactory.getCurrentSession();
		List<UserMaintainData> userMaintainData = new ArrayList<UserMaintainData>();
		try {
			String query = "from UserMaintainData umtd where umtd.JourneyStartingPoint =: startingPoint and  umtd.JourneyDestinationPoint =: DestinationPoint";
			userMaintainData = session.createQuery(query).setString("startingPoint", startingPoint).setString("DestinationPoint", DestinationPoint).list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return userMaintainData;
	}
	

}
