package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.beans.Employee;
import com.example.demo.beans.EmployeeRegistration;
import com.example.demo.beans.EmployeeOprationResponse;

/**
 * Employee registration Service
 * 
 * @author Jagdev
 *
 */
@Controller
public class EmployeeRegistrationController {
	@RequestMapping(method = RequestMethod.POST, value = "/register/employee")
	@ResponseBody
	public EmployeeOprationResponse registerEmployee(@RequestBody Employee employee) {
		System.out.println("Start :: registerEmployee");
		EmployeeOprationResponse empregisterResponse = new EmployeeOprationResponse();
		EmployeeRegistration.getInstance().add(employee);
		// We are setting the below value just to reply a message back to the caller
		empregisterResponse.setFirstName(employee.getFirstName());
		empregisterResponse.setLastName(employee.getLastName());
		empregisterResponse.setAge(employee.getAge());
		empregisterResponse.setEmployeeID(employee.getEmployeeID());
		empregisterResponse.setOprationStatus("Successful");
		System.out.println("End :: registerEmployee");
		return empregisterResponse;
	}
}
