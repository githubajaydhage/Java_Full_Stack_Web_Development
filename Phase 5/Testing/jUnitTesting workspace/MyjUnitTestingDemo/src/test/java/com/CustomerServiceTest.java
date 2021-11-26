package com;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerServiceTest {

	static CustomerService cs;
	@BeforeClass
	public static void beforeClass() {
		cs = new CustomerService();
	}
	@AfterClass
	public static void afterClass() {
		cs = null;					// GC
	}
	@Test
	public void testPassCustomer() {
		Customer cc = new Customer();
		cc.setCid(100);
		cc.setCname("Ramesh");
		cc.setAge(21);
		cs= new CustomerService();
		String result = cs.passCustomer(cc);
		assertEquals("Ramesh", result);
		//fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerInfo() {
		//fail("Not yet implemented");
		cs = new CustomerService();
		Customer cc= cs.getCustomerInfo();
		//assertNull(cc);
		assertNotNull(cc);
		assertEquals(100, cc.getCid());
		assertEquals("Raj", cc.getCname());
		assertEquals(21, cc.getAge());		
	}

	@Test
	public void testPassName() {
		//fail("Not yet implemented");
		List<String> stdNames = new ArrayList<String>();
		CustomerService cs = new CustomerService();
		stdNames.add("Raj");  stdNames.add("Ramesh"); stdNames.add("Lokesh");
			int leng = cs.passName(stdNames);
			assertEquals(3, leng);
	}

	@Test
	public void testListOfCutomer() {
		Customer c1 = new Customer(100, "Ramesh", 21);
		Customer c2 = new Customer(101, "Ram", 24);
		Customer c3 = new Customer(102, "Raju", 28);
		List<Customer> list = new ArrayList<Customer>();
		list.add(c1); list.add(c2); list.add(c3);
		CustomerService cs = new CustomerService();
		int leng= cs.listOfCutomer(list);					// passing list of customer object to sevice return int value. 
		assertEquals(3, leng);
	}

	@Test
	public void testGetAllCutomerInfo() {
		//fail("Not yet implemented");
		CustomerService cs = new CustomerService();
		List<Customer> listOfCustomers = cs.getAllCutomerInfo();
		assertEquals(3, listOfCustomers.size());
		Customer cc = listOfCustomers.get(0);
		assertEquals(1, cc.getCid());
		assertEquals("Ramesh", cc.getCname());
		assertEquals(21, cc.getAge());
	}

	@Test 
	public void testDisplayInfo() {
		CustomerService cs = new CustomerService();
		assertEquals("Hi", cs.msg);    // Before call  Hi 
		cs.displayInfo();
		assertEquals("Hello", cs.msg);   // After call Hello
	}
}
