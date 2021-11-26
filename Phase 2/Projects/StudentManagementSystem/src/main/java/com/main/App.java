package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bean.Student;
import com.service.StudentService;

public class App {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the id");
//		int sid = sc.nextInt();
//		System.out.println("Enter the name");
//		String name = sc.next();
//		System.out.println("Enter the age");
//		int age = sc.nextInt();
//		Student s = new Student(sid,name,age);
//		StudentService ss = new StudentService();
//		String res = ss.storeStudentRecord(s);
//		System.out.println(res);
		
		StudentService ss = new StudentService();
		List<Student>	listOfStudent	 = ss.getAllStudent();
		Iterator<Student> li = listOfStudent.iterator();
		while(li.hasNext()) {
			Student s = li.next();
			System.out.println("Id is "+s.getSid()+" Name is "+s.getName()+" Age is "+s.getAge());
		}
	}

}
