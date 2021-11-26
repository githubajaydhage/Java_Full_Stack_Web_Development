package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
		
	// This method calling Dao method using JPA
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
	

	
	public String storeEmployeeRecord(Employee emp) {
		if(employeeDao.storeEmployeeRecord(emp)) {
			return "Stored successfully";
		}else {
			return "Didn't store";
		}
	}
	
	public String updateEmployeeRecords(Employee emp) {
		if(employeeDao.updateEmployeeRecord(emp)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	
	public String deleteEmployeeRecords(int id) {
		if(employeeDao.deleteEmployeeRecord(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public Employee findEmployee(int id) {
		return employeeDao.findEmployeeUsingId(id);
	}
}

