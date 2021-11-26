package com;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;

@RestController
public class EmployeeController {

	@RequestMapping(value = "empInfo",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeInfo() {
		Employee emp = new Employee(100,"Ravi",12000);
		return emp;	
	}
	@RequestMapping(value = "employees",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeInfo() {
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(new Employee(1, "Raj", 12000));
		listOfEmp.add(new Employee(2, "Ravi", 14000));
		listOfEmp.add(new Employee(3, "Ramesh", 16000));
		return listOfEmp;
	}
	
	// single query param 
	// http://localhost:9090/singleQuery?name=Raj
	@RequestMapping(value = "singleQuery",method = RequestMethod.GET)
	public String singleQuery(@RequestParam("name") String fname) {
		return "Welcome user "+fname;
	}
	// Multiple Query param 
	// http://localhost:9090/multipleQuery?name=Raj&pass=123
	@RequestMapping(value = "multipleQuery",method = RequestMethod.GET)
	public String multipleQuery(@RequestParam("name") String name, @RequestParam("pass") String pass) {
			if(name.equals("Raj") && pass.equals("123")) {
				return "success";
			}else {
				return "failure";
			}
	}
	// http://localhost:9090/singlePath/Ramesh
	@RequestMapping(value = "singlePath/{name}",method = RequestMethod.GET)
	public String singlePathValue(@PathVariable("name") String name) {
		return "Welcome user for path param "+name;
	}
	
	// http://localhost:9090/multiplePath/100/Raj/12000
	@RequestMapping(value = "multiplePath/{id}/{name}/{salary}",method = RequestMethod.GET)
	public String multiplePathValue(@PathVariable("id") int id, @PathVariable("name") String name, 
			@PathVariable("salary") float salary) {
		return "Welcome user Id is "+id+" Name "+name+" salary is  "+salary;
	}
	
	// http://localhost:9090/storeEmployee 
	@RequestMapping(value = "storeEmployee",method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeEmployeeInfo(@RequestBody Employee emp) {	//@RequestBody annotation receive the object from body part. 
		System.out.println(emp);
		return "Store records";
	}
	
	@RequestMapping(value = "updateEmployee",method = RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployeeInfo(@RequestBody Employee emp) {	//@RequestBody annotation receive the object from body part. 
		Employee e1 = new Employee();
		e1.setId(emp.getId());
		e1.setSalary(emp.getSalary());
		return e1;
	}
	@RequestMapping(value = "deleteEmployee/{id}",method = RequestMethod.DELETE)
	public String deleteEmployeeInfo(@PathVariable("id") int id) {
		return "REcord deleted with id is "+id;
	}
}



