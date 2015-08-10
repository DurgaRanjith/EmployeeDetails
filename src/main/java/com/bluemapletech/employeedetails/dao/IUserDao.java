package com.bluemapletech.employeedetails.dao;

import com.bluemapletech.employeedetails.dto.User;
import com.bluemapletech.employeedetails.dto.UserLogin;

public interface IUserDao {
	
	public User performLogin(UserLogin userlogin);

}
