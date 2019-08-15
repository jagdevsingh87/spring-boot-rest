package com.example.demo.beans;
/**
 * This class will be used to reply a response back to the client application.
 * @author Jagdev
 *
 */
public class EmployeeOprationResponse {
	private String firstName;
	private String lastName;
	private int age;
	private int employeeID;
	private String oprationStatus;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getOprationStatus() {
		return oprationStatus;
	}
	public void setOprationStatus(String oprationStatus) {
		this.oprationStatus = oprationStatus;
	}
	
}
