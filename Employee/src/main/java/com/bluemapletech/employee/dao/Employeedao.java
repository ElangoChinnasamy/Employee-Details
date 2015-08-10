package com.bluemapletech.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemapletech.employee.model.EmployeeModel;

       /*In This Class For DAO Class Connecting with DataBase*/


@Repository
public class Employeedao  implements EmployeedaoInterface{
	
	
	private DataSource dataSource;

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	 public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/*In This Method For Registration Method*/
	
	public EmployeeModel getRegisterData(EmployeeModel employeemodel)
	 {
		
		String sql = "INSERT INTO user"
				+ "(username,password, temp_password,email_address,first_name,last_name,dob,age,sex)  VALUES (?, ?, ?,?,?,?,?,?,?)";
		
		jdbcTemplate.update(sql, new Object[] { employeemodel.getUsername(),
				 employeemodel.getPassword(),  employeemodel.getEmail_address(),
				 employeemodel.getFirst_name(),  employeemodel.getLast_name(), employeemodel.getDob(), employeemodel.getAge(), employeemodel.getSex() });
		
		return null;
		 
		 
	 } /*Registration Method END*/
	
	
	
	
	
	/*In This Method For Login Method*/
	public EmployeeModel getLoginData(EmployeeModel employeemodel)
	 {
		 
		 
		 String sql = "SELECT * FROM user WHERE username='"
					+ employeemodel.getUsername() + "' AND password='"
					+ employeemodel.getPassword() + "'";
		
		 Connection connection = null;
			ResultSet rs = null;

			try {

				connection = dataSource.getConnection();
				PreparedStatement ps = (PreparedStatement) connection
						.prepareStatement(sql);
				rs = ps.executeQuery(sql);
				if (rs.next() && rs != null) {
					if (rs.getString("username").equals(employeemodel.getUsername())
							&& rs.getString("password").equals(employeemodel.getPassword())) {
						System.out.println("Success");
						employeemodel.setCheck(false);

					} else {
						System.out.println("Failure");
					}

				}
				System.out.println(ps);
				ps.close();
			}

			catch (Exception e) {
				System.out.println(e.getLocalizedMessage());

			}

			
			 
	return employeemodel;
		 
	 }
	
} /*Login Method End*/
