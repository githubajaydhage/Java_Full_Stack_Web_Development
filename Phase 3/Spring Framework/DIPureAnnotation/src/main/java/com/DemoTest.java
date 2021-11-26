package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac = new AnnotationConfigApplicationContext(ConfiguratonDemo.class);
Employee emp = (Employee)ac.getBean("employee");
System.out.println(emp);
Manager mgr = (Manager)ac.getBean("mgr");
mgr.disMgr();
	}

}
