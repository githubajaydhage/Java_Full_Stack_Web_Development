package service;

import dao.EmployeeDao;

public class EmployeeService {

		EmployeeDao ed = new EmployeeDao();
		
		public String getSimpleMessage() {
			return "Welcome to Simple Service Method";
		}
		
		// This method depends upon the Dao method code. 
		public String callDbMethod() {
			
			return ed.getDbDetails();
		}
}
