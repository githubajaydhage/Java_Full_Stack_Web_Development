package test;

import static org.junit.Assert.*;
//import static java.lang.Math.*;
import org.junit.Test;

import com.Operation;

public class OperationTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Operation op = new Operation();
		int result = op.add(10, 20);
		assertEquals(30, result);
		
//		System.out.println(Math.PI);
//		System.out.println(Math.sqrt(9));
//		System.out.println(PI);
//		System.out.println(sqrt(9));
	}

}
