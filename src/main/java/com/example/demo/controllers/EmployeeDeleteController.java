package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.EmployeeOprationResponse;
import com.example.demo.beans.EmployeeRegistration;

/**
 * Employee delete service
 * 
 * @author Jagdev
 *
 */
@RestController
public class EmployeeDeleteController {

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/employee/{employeeID}")
	public EmployeeOprationResponse deleteEmployeeRecord(@PathVariable("employeeID") int employeeID) {
		System.out.println("Deleting employee record");
		EmployeeOprationResponse employeeupdateStatus = new EmployeeOprationResponse();
		employeeupdateStatus.setEmployeeID(employeeID);
		employeeupdateStatus.setOprationStatus(EmployeeRegistration.getInstance().deleteEmployee(employeeID));
		return employeeupdateStatus;
	}

}
