package com;

public class EmployeeService {

	public float updateSalary(int id, String name, float salary, String desg) {
			if(desg.equals("Manager")) {
				return salary+5000;
			}else if(desg.equals("Developer")) {
				return salary+3000;
			}else {
				return salary;
			}
	}
}
