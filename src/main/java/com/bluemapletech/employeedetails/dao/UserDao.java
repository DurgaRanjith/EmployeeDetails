package com.bluemapletech.employeedetails.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.bluemapletech.employeedetails.dto.User;
import com.bluemapletech.employeedetails.dto.UserLogin;


@Repository
public class UserDao implements IUserDao {
	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*@Value("${UserDao.performLogin}")
	private String performLogin;*/
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

/*	public String getPerformLogin() {
		return performLogin;
	}

	public void setPerformLogin(String performLogin) {
		this.performLogin = performLogin;
	}*/
	
	
	
	public User performLogin(UserLogin userlogin) {
		/*System.out.println("Login Query: " + performLogin + " with params: "
				+ username + "," + password);*/
		System.out.println("hai"+userlogin.getUsername());
	/*	try {*/
			String sql = "SELECT * FROM user WHERE username='"
					+ userlogin.getUsername() + "' AND password='"
					+ userlogin.getPassword() + "'";
			return jdbcTemplate.query(sql, new ResultSetExtractor<User>() {

						public User extractData(ResultSet rs)
								throws SQLException, DataAccessException {
							if (rs.next()) {
								User user = new User();
								user.setUser_id(rs.getInt(1));
								user.setUsername(rs.getString(2));
								user.setPassword(rs.getString(3));
								user.setTemp_password(rs.getString(4));
								user.setEmailaddress(rs.getString(5));
								user.setFirst_name(rs.getString(6));
								user.setLast_name(rs.getString(7));
								user.setDob(rs.getString(8));
								user.setAge(rs.getString(9));
								user.setSex(rs.getString(10));
								return user;
							}
							return null;
						}
					}, new Object[] { userlogin});
		/*	if (user != null) {
				return user;
			}*/
	/*}*/ /*catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}*/
		/*return null;*/
	}

}
