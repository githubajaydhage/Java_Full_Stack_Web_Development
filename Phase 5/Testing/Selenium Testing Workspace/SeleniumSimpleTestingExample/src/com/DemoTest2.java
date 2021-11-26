package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91990\\Desktop\\Comviva Training\\Phase 2\\Phase 5\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		// it can be firefox, edge, ie or chrome 
		driver.get("file:///C:/Users/91990/Desktop/Comviva%20Training/Phase%202/Phase%205/Testing/Web%20App/index.html");
		//driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebElement textField = driver.findElement(By.id("u1"));
		WebElement passwordField = driver.findElement(By.id("p1"));
		textField.sendKeys("Ajay");
		passwordField.sendKeys("123");
		WebElement submitButton = driver.findElement(By.id("b1"));
		submitButton.click();
		String result = driver.switchTo().alert().getText();
		System.out.println(result);
		//driver.close();
	}

}
