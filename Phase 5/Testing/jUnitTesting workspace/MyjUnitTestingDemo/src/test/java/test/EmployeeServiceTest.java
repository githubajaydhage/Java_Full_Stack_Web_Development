package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.EmployeeService;

public class EmployeeServiceTest {

	@Test
	public void testUpdateSalary() {
		EmployeeService es = new EmployeeService();
		float updatedSalary = es.updateSalary(100, "Raj", 45000, "Developer");
		assertEquals(48000, updatedSalary,0);
	}

}
