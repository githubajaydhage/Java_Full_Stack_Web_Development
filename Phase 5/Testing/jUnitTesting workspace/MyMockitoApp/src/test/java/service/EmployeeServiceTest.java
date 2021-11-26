package service;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import dao.EmployeeDao;
@RunWith(MockitoJUnitRunner.class)				//
public class EmployeeServiceTest {
	@Mock											// creating the mock for Dao layer. 
	EmployeeDao employeeDao;
	@InjectMocks										// injecting means pulling the object of Dao in Service layer. 
	EmployeeService employeeService;
	@Test
	public void testGetSimpleMessage() {
	
	}
	@Test
	public void testCallDbMethod() {
		// we are providing fake data 
		//when(employeeService.callDbMethod()).thenReturn("Fake Db method Code");
		
		when(employeeService.callDbMethod()).thenCallRealMethod();
		
		// Here we are doing the testing 
		assertEquals(employeeService.callDbMethod(), "Db Details information");
		
		
	}

}
