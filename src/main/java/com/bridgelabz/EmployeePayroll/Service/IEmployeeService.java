package com.bridgelabz.EmployeePayroll.Service;

import com.bridgelabz.EmployeePayroll.Model.Employee;
import com.bridgelabz.EmployeePayroll.Utility.EmployeeDTO;
import com.bridgelabz.EmployeePayroll.Utility.Response;

public interface IEmployeeService {

	Response getAllEmployee();
	
	Response addEmployee(EmployeeDTO employeedto);

	Response getById(int id);
	
	Response updateEmployee(int id, EmployeeDTO employeeDto);
	
	Response deleteEmployee(int id);

	Response getEmployeeById(int empId);

	Response getEmployeeByName(String empName);
	
}
