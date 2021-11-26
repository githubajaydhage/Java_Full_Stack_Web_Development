package com.main;

import java.util.Iterator;
import java.util.List;

import com.entity.Student;
import com.service.StudentService;

public class App {

	public static void main(String[] args) {
//	Student ss = new Student();
//	ss.setSid(5);
//	ss.setName("Mahesh");
//	ss.setAge(25);
//	StudentService ser =new StudentService();
//	String result = ser.storeStudentInfo(ss);
//	System.out.println(result);
		
//	Student ss = new Student();
//	ss.setSid(5);
//	ss.setAge(32);
//	StudentService ser = new StudentService();
//	String res = ser.updateStudentInfo(ss);
//	System.out.println(res);
		
//	StudentService ser = new StudentService();
//	String result = ser.deleteStudentInfo(100);
//	System.out.println(result);
		
//		StudentService ser = new StudentService();
//		Student ss = ser.getStudentInfo(2);
//		System.out.println(ss);
		
		StudentService ser = new StudentService();
		//ser.getAllStudentDetails().forEach(s->System.out.println(s));
		
		List<Student> listOfstd = ser.getAllStudentDetails();
		Iterator<Student> li = listOfstd.iterator();
		while(li.hasNext()) {
			Student ss = li.next();
			System.out.println(ss);
		}
	}

}
