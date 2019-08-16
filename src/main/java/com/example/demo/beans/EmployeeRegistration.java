package com.example.demo.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmployeeRepository;

/**
 * Employee registration and update service
 * 
 * @author Jagdev
 *
 */
@Service
public class EmployeeRegistration {
	// Inject repository
	@Autowired
	EmployeeRepository employeeRepository;

	// bind single instance with class
	private static EmployeeRegistration employeeRegistration = null;

	// private constructor
	public EmployeeRegistration() {

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
		System.out.println("Employee " + employee);
		employeeRepository.save(employee);
	}

	/**
	 * Update employee record
	 */
	public String updateEmployee(Employee employee) {
		System.out.println(employeeRepository+"Updating employee  "+employee);
		Employee savedEmployee = employeeRepository.getOne(employee.getEmployeeID());
		savedEmployee.setAge(employee.getAge());
		savedEmployee.setFirstName(employee.getFirstName());
		savedEmployee.setLastName(employee.getLastName());
		return "Employee update successful";
	}

	/**
	 * Delete employee record
	 */
	public String deleteEmployee(int employeeID) {
		employeeRepository.deleteById(employeeID);
		return "Employee delete successful";

	}

	/**
	 * Get all employee records
	 */
	public List<Employee> getEmployeeRecords() {
		return employeeRepository.findAll();
	}
}
