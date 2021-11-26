package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.display();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp  = (Employee)ac.getBean("emp1");     // pull the objects from beans.xml 
//		emp.display();
//		Employee emp1 = (Employee)ac.getBean("emp1");
//		emp1.display();
//		
//		Employee emp2 = (Employee)ac.getBean("emp2");
//		emp2.display();
//		
//		Employee emp3 = (Employee)ac.getBean("emp2");
//		emp3.display();
//		
//		System.out.println(emp1);
//		
//		Employee emp4= (Employee)ac.getBean("emp3");
//		System.out.println(emp4);
//		
//		Employee emp5 = (Employee)ac.getBean("emp4");
//		System.out.println(emp5);
//		
//		Employee emp6 = (Employee)ac.getBean("emp5");
//		System.out.println(emp6);
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		
	}

}


