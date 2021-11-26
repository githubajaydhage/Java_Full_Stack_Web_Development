package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DemoTest.class, args);
		AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext();
		ac.scan("com");        // @Component and create the reference. 
		ac.refresh();
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
	}

}
