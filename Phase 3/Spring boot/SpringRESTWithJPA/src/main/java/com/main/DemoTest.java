package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
// it scan by default in current package. 
@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
public class DemoTest {

	public static void main(String[] args) {
		SpringApplication.run(DemoTest.class, args);
		System.out.println("Server runing.....");
	}

}
