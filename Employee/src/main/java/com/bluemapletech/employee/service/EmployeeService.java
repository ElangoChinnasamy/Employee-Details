package com.bluemapletech.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletech.employee.dao.Employeedao;
import com.bluemapletech.employee.model.EmployeeModel;

/*In This Class For Service Class Using Fetch data from DAO Class*/

@Service
public class EmployeeService implements EmployeeServiceInterface {
	
	@Autowired
	Employeedao employeedao;
	
	 public EmployeeModel getRegisterData(EmployeeModel employeemodel)
	 {
		return employeedao.getRegisterData(employeemodel);
		 
		 
		 
	 }
	 
	 public EmployeeModel getLoginData(EmployeeModel employeemodel)
	 {
		return employeemodel;
		 
	 }

}
