package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.LoginService;

public class LoginServiceTest {

  @Test
  public void checkUserTest() {
	  LoginService ls = new LoginService();
	  String res = ls.checkUser("Raj", "123");
	  assertEquals(res, "success");
  }
}
