package com.bridgelabz.EmployeePayroll.Utility;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
 

@Data
@ToString
@RequiredArgsConstructor
public class EmployeeDTO {
	
	private int id;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid: It should have at least 2 characters starting with Capital letter.")
	private String name;
	
	
	 @NotNull(message = "Department is Required")
    private String department;
	

	 @Pattern(regexp = "^[M|F]{1}$", message = "Please enter valid option")
    private  String gender;
	
	 @Min(value = 5000, message = "salary cannot be less than 5000.")
	    @Max(value = 500000, message = "Salary cannot be greater than 500000.")
    private long salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
    
   
    
}



