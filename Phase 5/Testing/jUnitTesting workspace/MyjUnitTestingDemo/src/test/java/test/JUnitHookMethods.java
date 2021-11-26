package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class JUnitHookMethods {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This method call only once before all test method");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This method call only once after all test method");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("This method call before each test method");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("This method call afer each test method");
	}
	@Test
	public void test() {
		System.out.println("While testing this method called... simple test method");
	}

	@Test
	public void test1() {
		System.out.println("While testing this method called... simple test1 method");
	}
}
