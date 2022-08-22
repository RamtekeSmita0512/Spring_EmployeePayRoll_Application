package com.bridgelabz.EmployeePayroll.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.EmployeePayroll.Model.Employee;
import com.bridgelabz.EmployeePayroll.Service.EmployeeService;
import com.bridgelabz.EmployeePayroll.Service.IEmployeeService;
import com.bridgelabz.EmployeePayroll.Utility.EmployeeDTO;
import com.bridgelabz.EmployeePayroll.Utility.Response;

@RestController

public class EmployeeContoller {
	
	
	    @Autowired
	    private IEmployeeService employeeService;
	    
	  
	    @GetMapping("/get/{empId}")
	    public ResponseEntity<Response> getEmployeeBYId(@PathVariable("empId") int empId) {
	            Response response = employeeService.getEmployeeById(empId);
	        return new ResponseEntity<Response>(response, HttpStatus.OK);
	    }
	    
	    @GetMapping("/employeeName")
		public ResponseEntity<Response> searchEmployeeByName(@RequestParam String empName) {
			Response response = employeeService.getEmployeeByName(empName);
			return new ResponseEntity<Response>(response, HttpStatus.OK);
		}

	    @PostMapping("/add")
	    public ResponseEntity<Response> addEmployee(@Valid @RequestBody EmployeeDTO empDTO) {
	        
	        Response response = employeeService.addEmployee(empDTO);
	        return new ResponseEntity<Response>(response, HttpStatus.OK);
	    }

	    @PutMapping("/update/{empId}")
	    public ResponseEntity<Response> updateEmployeePayrollData(@PathVariable("empId") int empId,@RequestBody EmployeeDTO empDTO) {
	        
	        Response response =employeeService.updateEmployee(empId, empDTO);
	        return new ResponseEntity<Response>(response, HttpStatus.OK);

	    }

	    @DeleteMapping("/delete/{empId}")
	    public ResponseEntity<Response> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
	        
	        Response response = employeeService.deleteEmployee(empId);
	        return new ResponseEntity<Response>(response, HttpStatus.OK);
	    }
	}

















