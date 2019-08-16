package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Employee;
import com.example.demo.beans.EmployeeRegistration;

/**
 * Service to fetch all employees
 * @author Jagdev
 *
 */
@RestController
public class EmployeeRetrieveController {
	@Autowired
	EmployeeRegistration employeeRegistration;
	@RequestMapping(method = RequestMethod.GET, value = "/employee/allemployees")
	public List<Employee> getAllEmployees() {
		return employeeRegistration.getEmployeeRecords();
	}

}
