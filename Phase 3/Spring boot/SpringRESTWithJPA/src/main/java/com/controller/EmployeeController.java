package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:9090/employees
	@RequestMapping(value = "employees",method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	// http://localhost:9090/storeEmployee
	
	@RequestMapping(value = "storeEmployee",method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployee(@RequestBody Employee emp) {
		return employeeService.storeEmployeeRecord(emp);
	}
	// http://localhost:9090/updateEmployee
	@RequestMapping(value = "updateEmployee",method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployeeRecords(emp);
	}
	
	// http://localhost:9090/deleteEmployee/100
	@RequestMapping(value = "deleteEmployee/{id}",method = RequestMethod.DELETE)
	public String deleteEmployeeRecord(@PathVariable("id") int empId) {
		return employeeService.deleteEmployeeRecords(empId);
	}
	// http://localhost:9090/findEmployee/101
	@RequestMapping(value = "findEmployee/{id}",method = RequestMethod.GET)
	public Employee findEmployeeRecordById(@PathVariable("id") int empId) {
		return employeeService.findEmployee(empId);
	}
}
