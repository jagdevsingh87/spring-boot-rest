package com.example.demo.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Employee registration and update service
 * @author Jagdev
 *
 */
public class EmployeeRegistration {
	// List of employees
	private List<Employee> employeeRecords;
	// bind single instance with class
	private static EmployeeRegistration employeeRegistration = null;

	// private constructor
	private EmployeeRegistration() {
		employeeRecords = new ArrayList<Employee>();
	}

	/**
	 * Method to create or return singleton instance
	 */
	public static EmployeeRegistration getInstance() {
		if (employeeRegistration == null) {
			employeeRegistration = new EmployeeRegistration();
			return employeeRegistration;
		} else {
			return employeeRegistration;
		}
	}
	
	/**
	 * Add employee record
	 */
	public void add(Employee employee) {
		employeeRecords.add(employee);
	}

	/**
	 * Update employee record
	 */
	public String updateEmployee(Employee employee) {
		int numberOfEmployee = employeeRecords.size();
		for (int i = 0; i < numberOfEmployee; i++) {
			Employee employeeRecord = employeeRecords.get(i);
			if (employeeRecord.getEmployeeID() == employee.getEmployeeID()) {
				employeeRecords.set(i, employee);
				return "Employee update successful";
			}
		}
		return "Employee update un-successful";
	}

	/**
	 * Delete employee record
	 */
	public String deleteEmployee(int employeeID) {
		int numberOfEmployee = employeeRecords.size();
		for (int i = 0; i < numberOfEmployee; i++) {
			Employee stdn = employeeRecords.get(i);
			if (stdn.getEmployeeID() == employeeID) {
				employeeRecords.remove(i);// update the new record
				return "Employee delete successful";
			}
		}
		return "Employee delete un-successful";
	}

	/**
	 * Get all employee records
	 */
	public List<Employee> getEmployeeRecords() {
		return employeeRecords;
	}
}
