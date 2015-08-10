package com.bluemapletech.employee.dao;

import com.bluemapletech.employee.model.EmployeeModel;

/*In This Class For DAO Interface Class*/

public interface EmployeedaoInterface {
	
	 public EmployeeModel getRegisterData(EmployeeModel employeemodel);
	 
	 public EmployeeModel getLoginData(EmployeeModel employeemodel);

}
