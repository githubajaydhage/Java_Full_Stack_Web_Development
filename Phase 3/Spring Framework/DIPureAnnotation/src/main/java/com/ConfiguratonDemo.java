package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration		// beans.xml file 
@ComponentScan(basePackages = "com")	// <context:componet-scan tag
public class ConfiguratonDemo {

	
	@Bean(name = "mgr")							// This method is responsible to create the object. 
	public Manager getManagerBean() {
		System.out.println("Object created by us and maintain by container");
		return new Manager();
	}
}
