package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.CustomerServiceTest;

@RunWith(Suite.class)
@SuiteClasses({ EmployeeServiceTest.class, 
	//JUnitHookMethods.class, 
	OperationTest.class,
	CustomerServiceTest.class })
public class AllTests {

}
