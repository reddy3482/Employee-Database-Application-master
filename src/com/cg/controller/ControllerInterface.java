package com.cg.controller;

import java.util.ArrayList;

import com.cg.data.Employee;
import com.cg.service.EmployeeService;

public interface ControllerInterface {
	public void addEmployee(Employee employeedetails);

	public ArrayList<Employee> viewAllEmployee();

	public Employee getEmpById(int empID);

	public void removeEmpById(int empID);

	public void setEmployeeService(EmployeeService service);

}
