package com.bridgelabz.EmployeePayroll.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.EmployeePayroll.Model.Employee;
import com.bridgelabz.EmployeePayroll.Repository.EmployeeRepository;
import com.bridgelabz.EmployeePayroll.Utility.EmployeeDTO;
import com.bridgelabz.EmployeePayroll.Utility.Response;

@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
 private EmployeeRepository employeeRespository;
	
	@Autowired
	private ModelMapper modelMapper = new ModelMapper();
	public Object addEmployee;
	
	public Response getAllEmployee(){
		List<Employee> employee = new ArrayList<>();
		employee= employeeRespository.findAll();
		Response object =new Response("All Employee Details", 200, employee);
		
				return object;
	}
	
	public Response addEmployee(EmployeeDTO employeedto) {
		Employee employee = modelMapper.map(employeedto, Employee.class);
		employeeRespository.save(employee);
		Response object =new Response("Employee added Successfully", 200, employee);
		return object;
		
	}
	 public Response getById(int id) {
	        return new Response();
	    }

	    public Response updateEmployee(int id, EmployeeDTO employeeDto) {
	        Employee employee = modelMapper.map(employeeDto,Employee.class);
	        employeeRespository.save(employee);
	        return new Response("Update Successfully", 200, employee);
	    }

	    public Response deleteEmployee(int id) {
	    	 
	        return new Response();
	    }

		@Override
		public Response getEmployeeById(int empId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Response getEmployeeByName(String empName) {
			// TODO Auto-generated method stub
			return null;
		}

	

		
	}
	

