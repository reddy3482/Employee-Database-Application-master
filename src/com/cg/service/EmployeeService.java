package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.data.Employee;
import com.cg.data.EmployeeDAO;

public class EmployeeService implements ServiceInterface {
	private EmployeeDAO dao;
	public static List<Employee> employee = new ArrayList<>();

	public void addEmployee(Employee employeedetails) {
		dao.addEmployee(employeedetails);
	}

	public ArrayList<Employee> viewAllEmployee() {
		return dao.viewAllEmployee();
	}

	public Employee getEmpById(int empID) {
		return dao.getEmpById(empID);
	}

	public void removeEmpById(int empID) {
		dao.removeEmpById(empID);
	}

	@Override
	public void setEMployeeDAO(EmployeeDAO empdao) {
		this.dao = empdao;

	}

}
