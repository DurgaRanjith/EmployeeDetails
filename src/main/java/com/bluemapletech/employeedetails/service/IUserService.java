package com.bluemapletech.employeedetails.service;

import com.bluemapletech.employeedetails.dto.User;
import com.bluemapletech.employeedetails.dto.UserLogin;

public interface IUserService  {
	
	public User performLogin(UserLogin userlogin);

}
