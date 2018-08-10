package com.cg.service;

import java.util.ArrayList;

import com.cg.data.Employee;
import com.cg.data.EmployeeDAO;

public interface ServiceInterface {
	public void addEmployee(Employee employeedetails);

	public ArrayList<Employee> viewAllEmployee();

	public Employee getEmpById(int empID);

	public void removeEmpById(int empID);

	public void setEMployeeDAO(EmployeeDAO empdao);
}
