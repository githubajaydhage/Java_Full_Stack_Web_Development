package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();
	
	public String storeStudentInfo(Student student) {
		if(studentDao.storeStudentRecord(student)) {
			return "Student Record store successfully";
		}else {
			return "Student didn't store";
		}
	}
	
	public List<Student> getAllStudent() {
		return studentDao.getAllStudentInfo();
	}
	
}
