package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
public class SpringBootWithDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithDataApplication.class, args);
		System.out.println("Server running");
	}

}
