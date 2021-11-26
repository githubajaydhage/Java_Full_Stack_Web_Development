package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;
import com.service.StudentService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac  = new ClassPathXmlApplicationContext("beans.xml");
Student std = (Student)ac.getBean("student");
std.setSid(12);
std.setName("Ram Patil");
std.setAge(33);
StudentService ss = (StudentService)ac.getBean("studentService");
//String res = ss.storeStudentInfo(std);
//System.out.println(res);

//	List<Map<String, Object>> listInfo = ss.getAllStudentInfo();
//	System.out.println(listInfo);
//	for(Map<String, Object> mm : listInfo) {
//		Set<Map.Entry<String, Object>> set = mm.entrySet();
//		Iterator<Map.Entry<String, Object>> ii = set.iterator();
//		while(ii.hasNext()) {
//			System.out.println(ii.next());
//		}
//	}
List<Map<String,Object>> listOfStudentAndCourse = ss.getStudentAndCourseInfo("Angular");
System.out.println(listOfStudentAndCourse);
	}

}


