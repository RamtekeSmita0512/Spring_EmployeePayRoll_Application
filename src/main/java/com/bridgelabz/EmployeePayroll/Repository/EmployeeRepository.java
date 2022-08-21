package com.bridgelabz.EmployeePayroll.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.EmployeePayroll.Model.Employee;
import com.bridgelabz.EmployeePayroll.Utility.EmployeeDTO;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {




}
