package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WebApplicationTest {
	WebDriver driver;	
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91990\\Desktop\\Comviva Training\\Phase 2\\Phase 5\\chromedriver.exe");
		  	// it can be firefox, edge, ie or chrome
		driver = new ChromeDriver();
		  driver.get("file:///C:/Users/91990/Desktop/Comviva%20Training/Phase%202/Phase%205/Testing/Web%20App/index.html");
			//driver.navigate().to("https://www.google.com");
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	  }
	@Test
  public void webPageTest() {
		WebElement textField = driver.findElement(By.id("u1"));
		WebElement passwordField = driver.findElement(By.id("p1"));
		textField.sendKeys("Ajay");
		passwordField.sendKeys("123");
		WebElement submitButton = driver.findElement(By.id("b1"));
		submitButton.click();	
		String result = driver.switchTo().alert().getText();
		assertEquals(result, "success");
		//String homePageTitle = driver.getTitle();
		//System.out.println(homePageTitle);	
  }
  @AfterTest
  public void afterTest() {
	 driver.switchTo().alert().dismiss();
	  driver.close();
  }

}
