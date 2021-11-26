package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91990\\Desktop\\Comviva Training\\Phase 2\\Phase 5\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		// it can be firefox, edge, ie or chrome 
		driver.get("https://www.google.com");
		//driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
				WebElement searchTextField = driver.findElement(By.name("q"));
				searchTextField.sendKeys("Selenium Documentation");
				WebElement searchButton = driver.findElement(By.name("btnK"));
				searchButton.click();
		//driver.close();
	}

}
