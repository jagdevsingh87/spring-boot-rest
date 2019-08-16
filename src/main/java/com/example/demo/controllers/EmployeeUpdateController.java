package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Employee;
import com.example.demo.beans.EmployeeOprationResponse;
import com.example.demo.beans.EmployeeRegistration;

/**
 * Employee update service
 * @author Jagdev
 *
 */
@RestController
public class EmployeeUpdateController {
	
	@Autowired
	EmployeeRegistration employeeRegistration;
	
	@RequestMapping(method = RequestMethod.PUT, value="/update/employee")
	public EmployeeOprationResponse updateEmployeeRecord(@RequestBody Employee employee) {
	    System.out.println("Updating employee record");
	    EmployeeOprationResponse employeeupdateStatus = new EmployeeOprationResponse();
	    employeeupdateStatus.setOprationStatus(employeeRegistration.updateEmployee(employee));
	    return employeeupdateStatus;
	}

}
