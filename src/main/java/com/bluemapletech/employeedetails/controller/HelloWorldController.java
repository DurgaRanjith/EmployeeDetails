package com.bluemapletech.employeedetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bluemapletech.employeedetails.dto.User;
import com.bluemapletech.employeedetails.dto.UserLogin;
import com.bluemapletech.employeedetails.service.UserService;
import com.bluemapletech.employeedetails.utils.ResponseObject;

@RestController
@RequestMapping(value = "/service")

public class HelloWorldController {

	@Autowired
	private UserService userService;



	@RequestMapping(method = RequestMethod.GET)
	public Object initService() {
		return "Service is running!";
	}

	@RequestMapping(value = "/user/login", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
			
	public  ResponseObject userLogin(@RequestBody UserLogin userlogin) {

		User users = userService.performLogin(userlogin);
		System.out.println("User result: " + users);

		ResponseObject response = new ResponseObject();

		if (users != null) {
			response.setResult(users);
			response.setInfo("Login successful!");
			return response;
		} else {
			response.setWarning("Invalid UserName or Password!");
		}

		return response;
	}}
