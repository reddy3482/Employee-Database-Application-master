package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import com.cg.data.Employee;
import com.cg.service.EmployeeService;

public class EmployeeController implements ControllerInterface {
	private EmployeeService serv;
	public static List<Employee> employee = new ArrayList<>();

	public void addEmployee(Employee employeedetails) {
		serv.addEmployee(employeedetails);
	}

	public ArrayList<Employee> viewAllEmployee() {
		return serv.viewAllEmployee();
	}

	public Employee getEmpById(int empID) {
		return serv.getEmpById(empID);
	}

	public void removeEmpById(int empID) {
		serv.removeEmpById(empID);
	}

	@Override
	public void setEmployeeService(EmployeeService service) {
		this.serv = service;
	}

}
