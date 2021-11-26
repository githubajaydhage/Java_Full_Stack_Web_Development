package com;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
		// passing the object as a parameter and return String 
			public String passCustomer(Customer cc) {
						return cc.getCname();
			}
			// return customer class object 
			public Customer getCustomerInfo() {
				Customer cc  = new Customer(100, "Raj", 21);
				return cc;
			}
			// passing List of name and return length 
			public int passName(List<String> names) {
				// simple or object coding..
				return names.size();
			}
			// passing the listOf customer object and return int 
			public int listOfCutomer(List<Customer> listOfCutomer ) {
				return listOfCutomer.size();
			}
			// return list of customer object 
			public List<Customer> getAllCutomerInfo() {
				List<Customer> listOfCust = new ArrayList<Customer>();
				listOfCust.add(new Customer(1, "Ramesh", 21));
				listOfCust.add(new Customer(2, "Mahesh", 23));
				listOfCust.add(new Customer(3, "Lokesh", 24));
				return listOfCust;
			}
			public String msg="Hi";
			// This method no passing parameter as well as no return type 
			public void displayInfo() {
				System.out.println("Welcome");
				msg = "Hello";
			}
}
