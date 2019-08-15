package com.example.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.beans.Employee;
import com.example.demo.beans.EmployeeRegistration;

/**
 * Service to fetch all employees
 * @author Jagdev
 *
 */
@Controller
public class EmployeeRetrieveController {

	@RequestMapping(method = RequestMethod.GET, value = "/employee/allemployees")
	@ResponseBody
	public List<Employee> getAllEmployees() {
		return EmployeeRegistration.getInstance().getEmployeeRecords();
	}

}
