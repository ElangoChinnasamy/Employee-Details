package com.bluemapletech.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RequestMethod;

import com.bluemapletech.employee.model.EmployeeModel;
import com.bluemapletech.employee.service.EmployeeServiceInterface;


/*In This Class For Controller Class Using Mapping Purpose for one page to another page*/

@Controller
@RequestMapping("/home")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceInterface employeeserviceinterface;
	
/*	In this Method For Login Method.It checking Correct username,password or Not*/
	
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String LoginMethod(@ModelAttribute EmployeeModel employeemodel)
	{
	
	employeemodel=employeeserviceinterface.getLoginData(employeemodel);
		if(employeemodel.isCheck())
		{
			return "dashboard";
		}
	else
		{
			return "Login";
		}
	} /*End Login Method Controller*/
	

	/*	In This Method For Registration Method Using New User SignUp Page*/
	
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public String RegisterMethod(@ModelAttribute EmployeeModel employeemodel){
		
		employeeserviceinterface.getRegisterData(employeemodel);
		
				return "Login";
		
			}
	} /*End Registration Method*/
