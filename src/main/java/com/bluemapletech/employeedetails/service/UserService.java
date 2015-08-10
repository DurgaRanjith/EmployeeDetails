package com.bluemapletech.employeedetails.service;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.bluemapletech.employeedetails.dao.IUserDao;
import com.bluemapletech.employeedetails.dto.User;
import com.bluemapletech.employeedetails.dto.UserLogin;


@Service
public class UserService implements IUserService {
	@Autowired
	 IUserDao dao;
	
	public User performLogin(UserLogin userlogin){
		
		return dao.performLogin(userlogin);
	}

}
