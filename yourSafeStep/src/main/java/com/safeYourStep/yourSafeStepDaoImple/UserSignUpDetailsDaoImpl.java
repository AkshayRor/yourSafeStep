package com.safeYourStep.yourSafeStepDaoImple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.safeYourStep.yourSafeStepDAO.UserSignUpDAO;
import com.safeYourStep.yourSafeStepEntity.UserSignUpDetails;

@Repository
@Transactional
public class UserSignUpDetailsDaoImpl implements UserSignUpDAO{

@Autowired
SessionFactory sessionFactory;
	
	public UserSignUpDetails saveUserSignUpDetails(UserSignUpDetails userSignUpDetails) {
		Session session = this.sessionFactory.getCurrentSession();
		try {
			session.saveOrUpdate(userSignUpDetails);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return userSignUpDetails;
	}

}
