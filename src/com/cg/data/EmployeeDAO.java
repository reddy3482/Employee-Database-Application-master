package com.cg.data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	public static List<Employee> employee = new ArrayList<>();

	public void addEmployee(Employee employeedetails) {
		employee.add(new Employee(employeedetails.getEmployeeName(), employeedetails.getEmployeeID(),
				employeedetails.getEmployeeSalary()));
	}

	public ArrayList<Employee> viewAllEmployee() {
		return (ArrayList<Employee>) employee;
	}

	public Employee getEmpById(int empID) {
		Employee emp = null;
		for (Employee emp1 : employee) {
			if (emp1.getEmployeeID() == empID)
				emp = emp1;
		}
		return emp;
	}

	public void removeEmpById(int empID) {
		Employee emp = null;
		for (Employee emp1 : employee) {
			if (emp1.getEmployeeID() == empID)
				employee.remove(emp1);
		}
	}

}
