package com.bluemapletech.employee.model;


/*In This Class For Model Class New User Signup Details*/

public class EmployeeModel {
	
	private String username;
	private String password;
	private String temp_password;
	private String email_address;
	private String first_name;
	private String last_name;
	private String dob;
	private int age;
	private String sex;
	boolean check;
	
	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
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
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "EmployeeModel [username=" + username + ", password=" + password
				+ ", temp_password=" + temp_password + ", email_address="
				+ email_address + ", first_name=" + first_name + ", last_name="
				+ last_name + ", dob=" + dob + ", age=" + age + ", sex=" + sex
				+ "]";
	}

}
