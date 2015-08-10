package com.bluemapletech.employeedetails.dto;

public class User {
	private int user_id;
	private String username;
	private String password;
	private String temp_password;
	private String emailaddress;
	private String first_name;
	private String last_name;
	private String dob;
	private String age;
	private String sex;
	
	public User() {
	};
	
	
	public User(int user_id,String username, String password, String temp_password,
			String emailaddress, String first_name, String last_name,
			String dob, String age, String sex) {
		
		this.user_id=user_id;
		this.username = username;
		this.password = password;
		this.temp_password = temp_password;
		this.emailaddress = emailaddress;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.age = age;
		this.sex = sex;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTemp_password() {
		return temp_password;
	}
	public void setTemp_password(String temp_password) {
		this.temp_password = temp_password;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
