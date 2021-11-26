package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NgTestingHooks {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("While testing");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before any method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After any method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("After Test function ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Test class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test function ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test function ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite it will execute");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite it will execute");
  }

}
