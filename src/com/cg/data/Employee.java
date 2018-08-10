package com.cg.data;

public class Employee {
	public String EmployeeName;
	private int EmployeeID;
	private float EmployeeSalary;

	public Employee(String employeeName, int employeeID, float employeeSalary) {
		super();
		EmployeeName = employeeName;
		EmployeeID = employeeID;
		EmployeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public float getEmployeeSalary() {
		return EmployeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeID=" + EmployeeID + "]";
	}

}
