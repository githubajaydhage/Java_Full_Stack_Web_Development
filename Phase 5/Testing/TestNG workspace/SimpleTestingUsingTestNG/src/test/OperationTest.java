package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.Operation;

public class OperationTest {
  @Test
  public void testAdd() {
	  Operation op = new Operation();
	  int res = op.add(100, 200);
	  assertEquals(res, 300);
  }
  @Test
  public void testSub() {
	  Operation op = new Operation();
	  int res = op.sub(200, 100);
	  assertEquals(res, 500);
  }
  
  @Test
  public void testMul() {
	  Operation op = new Operation();
	  int res = op.mul(2,5);
	  assertEquals(res, 10);
  }
  
  @Test
  public void testDiv() {
	  Operation op = new Operation();
	  int res = op.div(200, 100);
	  assertEquals(res, 2);
  }
}
