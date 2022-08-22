package com.bridgelabz.EmployeePayroll.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
@Table(name="Employee_table")


	
public class Employee {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	 	private int id;
		private String name;
		private String department;
		private  String gender;
		private  long salary;
	   
	    
		public Employee(String name, String department, String gender, long salary, int id) {
			
			this.name = name;
			this.department = department;
			this.gender = gender;
			this.salary = salary;
			this.id = id;
		}

		public Employee() {
			
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

		public void setSalary(long salary) {
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	    
	    
}
